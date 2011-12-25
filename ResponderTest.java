

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ResponderTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ResponderTest
{
    /**
     * Default constructor for test class ResponderTest
     */
    public ResponderTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }


    @Test
    public void generateResponse4()
    {
        java.util.HashSet<java.lang.String> possibleValues =
            new java.util.HashSet<String>();
        java.util.HashSet<java.lang.String> words =
            new java.util.HashSet<String>();
        Responder responder = new Responder(new TechSupportAnswers());
        words.add("crash");
        words.add("slow");
        possibleValues.add("Well, it never crashes on our system. It must have something\n" +             "to do with your system. Tell me more about your configuration.");
        possibleValues.add("I think this has to do with your hardware. Upgrading your processor\n" +             "should solve all performance problems. Have you got a problem with\n" +             "our software?");
        java.lang.String response = responder.generateResponse(words);
        assertEquals(true, possibleValues.contains(response));
    }
}




