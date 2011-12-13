import java.util.Iterator;
import java.util.Set;

/**
 * This class implements a technical support system.
 * It is the top level class in this project.
 * The support system communicates via text input/output
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input
 * from the user, and an object of class Responder to generate responses.
 * It contains a loop that repeatedly reads input and generates
 * output until the users wants to leave.
 * 
 * @author     Michael Kolling and David J. Barnes
 * @version    1.0
 */
public class SupportSystem
{
    private Iterator<Set<String>> reader;
    private Responder responder;
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem(Answers answers, Iterator<Set<String>> input)
    {
        reader = input;
        responder = new Responder(answers);
    }

    /**
     * Start the technical support system. This will print a welcome message and enter
     * into a dialog with the user, until the user ends the dialog.
     */
    public void start()
    {
        printWelcome();
        System.out.println("Please type 'bye' to exit our system.");
        for ( ; this.reader.hasNext(); )
        {
            System.out.println(this.responder.generateResponse(this.reader.next()));
        }
        
        printGoodbye();
    }

    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        for(String line : responder.getWelcome())
        {
            System.out.println(line);
        }
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        for(String line : responder.getFarewell())
        {
            System.out.println(line);
        }
    }
}
