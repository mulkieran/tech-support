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
 * @author  (your name)
 * @version (a version number or a date)
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
     * q1 to q4 to q0 for hasNext()
     */
    @Test
    public void test1()
    {
        InputReader inputRea1 = new InputReader(new ByteArrayInputStream(new String("slow").getBytes()));
        assertEquals(true, inputRea1.hasNext());
        assertEquals(true, inputRea1.hasNext());
    }
    
    /**
     * q1 to q4 to q5 in next()
     */
    @Test
    public void test2()
    {
        InputReader inputRea1 = new InputReader(new ByteArrayInputStream(new String("slow").getBytes()));
        Set<String> inp = inputRea1.next();
        Set<String> expected = new HashSet<String>();
        expected.add("slow");
        assertEquals(inp, expected);
    }
    
    /**
     * q0 to q5 in next()
     */
    @Test
    public void test3()
    {
        InputReader inputRea1 = new InputReader(new ByteArrayInputStream(new String("slow").getBytes()));
        inputRea1.hasNext();        
        Set<String> inp = inputRea1.next();
        Set<String> expected = new HashSet<String>();
        expected.add("slow");
        assertEquals(inp, expected);
    }
    
    /**
     * q1 to q4 to q3 in hasnext()
     * 
     */
    @Test
    public void test4()
    {
        InputReader inputRea1 = new InputReader(new ByteArrayInputStream(new String("bye").getBytes()));
        assertEquals(false, inputRea1.hasNext());
        assertEquals(false, inputRea1.hasNext());
    }
    
    /**
     * q1 to q3 in hasnext()
     * 
     */
    @Test
    public void test5()
    {
       
    }
    
    /**
     * q0 to q0 in hasnext()
     * 
     */
    @Test
    public void test6()
    {
       
    }
    
    /**
     * q3 to q3
     * 
     */
    @Test
    public void test7()
    {
       
    }
    
}

