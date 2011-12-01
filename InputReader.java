import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

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
    public InputReader()
    {
        reader = new Scanner(System.in);
        done = false;
    }

    public boolean hasNext()
    {
        assert (!done || this.inputLine == null);
        if (done)
        {
            return false;
        }
        else
        {
            System.out.print("> ");
            
            if (reader.hasNextLine())
            {
                this.inputLine = reader.nextLine().trim().toLowerCase();
                if (this.inputLine.contains("bye"))
                {
                    done = true;
                    return false;
                }
                else
                {
                    return true;
                }
            }
            else
            {
                done = true;
                return false;
            }
        }
    }

    public Set<String> next()
    {
        if (this.inputLine.isEmpty())
        {
            return new HashSet<String>();
        }
        else
        {
            String[] wordArray = this.inputLine.split(" ");

            return new HashSet<String>(Arrays.asList(wordArray));
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
