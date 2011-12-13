import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;
import java.util.HashSet;

/**
 * The test class InputReaderTest.
 *
 * @author  Jesse Brake, Whitney Gain, and Melissa Rudzke
 * @version 13 December 2011
 */
public class InputReaderTest
{
    /**
     * Default constructor for test class InputReaderTest
     */
    public InputReaderTest()
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

    /**
     * q1 to q4 to q5 in next().
     */
    @Test
    public void next_1_4_5()
    {
        InputReader inputRea1 = new InputReader(new ByteArrayInputStream(new String("slow").getBytes()));
        Set<String> inp = inputRea1.next();
        Set<String> expected = new HashSet<String>();
        expected.add("slow");
        assertEquals(inp, expected);
    }

    /**
     * q0 to q5 in next().
     */
    @Test
    public void next_0_5()
    {
        InputReader inputRea1 = new InputReader(new ByteArrayInputStream(new String("slow").getBytes()));
        inputRea1.hasNext();        
        Set<String> inp = inputRea1.next();
        Set<String> expected = new HashSet<String>();
        expected.add("slow");
        assertEquals(inp, expected);
    }

    /**
     * q1 to q4 to q0 for hasNext().
     */
    @Test
    public void hasNext_1_4_0()
    {
        InputReader inputRea1 = new InputReader(new ByteArrayInputStream(new String("slow").getBytes()));
        assertEquals(true, inputRea1.hasNext());
        assertEquals(true, inputRea1.hasNext());
    }

    /**
     * q1 to q4 to q3 in hasNext().
     * 
     */
    @Test
    public void hasNext_1_4_3()
    {
        InputReader inputRea1 = new InputReader(new ByteArrayInputStream(new String("bye").getBytes()));
        assertEquals(false, inputRea1.hasNext());
        assertEquals(false, inputRea1.hasNext());
    }

    /**
     * q1 to q3 in hasNext().
     * 
     */
    @Test
    public void hasNext_1_3()
    {
        InputReader inputRea1 = new InputReader(new ByteArrayInputStream(new String("").getBytes()));
        assertEquals(false, inputRea1.hasNext());
    }

    /**
     * q0 to q0 in hasNext().
     * 
     */
    @Test
    public void hasNext_0_0()
    {
        InputReader inputRea1 = new InputReader(new ByteArrayInputStream(new String("slow").getBytes()));
        inputRea1.hasNext();
        assertEquals(true, inputRea1.hasNext());        
    }

    /**
     * q3 to q3 in hasNext().
     * 
     */
    @Test
    public void hasNext_3_3()
    {
        InputReader inputRea1 = new InputReader(new ByteArrayInputStream(new String("").getBytes()));
        inputRea1.hasNext();
        assertEquals(false, inputRea1.hasNext()); 
    }

}

