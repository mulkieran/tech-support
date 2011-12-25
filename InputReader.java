import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;
import java.io.InputStream;
import java.util.NoSuchElementException;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is then chopped into words, and a set of words 
 * is provided.
 * 
 * @author     Michael Kolling and David J. Barnes
 * @version    1.0
 */
public class InputReader implements Iterator<Set<String>>
{
    private Scanner reader;
    private String inputLine;
    private boolean done;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader(InputStream is)
    {
        reader = new Scanner(is);
        done = false;
    }

    private boolean getInput()
    {
        assert(!this.done && this.inputLine == null);
        System.out.print("> ");

        if (reader.hasNextLine())
        {
            String line = reader.nextLine().trim().toLowerCase();

            if (line.contains("bye"))
            {
                return false;
            }
            else
            {
                this.inputLine = line;
                return true;
            }
        }
        else
        {
            return false;
        }        
    }

    public boolean hasNext()
    {
        assert (!this.done || this.inputLine == null);
        if (done)
        {
            return false;
        }
        else
        {
            if (inputLine == null)
            {
                return !(done = !getInput());
            }
            else
            {
                return true;
            }
        }
    }

    private Set<String> nextSet()
    {
        assert(!this.done && this.inputLine != null);
        if (this.inputLine.isEmpty())
        {
            this.inputLine = null;
            return new HashSet<String>();
        }
        else
        {
            String[] wordArray = this.inputLine.split(" ");
            this.inputLine = null;
            return new HashSet<String>(Arrays.asList(wordArray));
        }
    }

    public Set<String> next()
    {
        assert (!this.done || this.inputLine == null);
        if (done)
        { 
            throw new NoSuchElementException();
        }        
        else
        {
            if (inputLine == null)
            { 
                if (this.getInput())
                {
                    return this.nextSet();
                }
                else
                {
                    done = true;
                    throw new NoSuchElementException();
                }
            }
            else
            {
                return this.nextSet();
            }
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
