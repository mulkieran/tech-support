import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

    @Test
    public void test1()
    {
        InputReader inputRea1 = new InputReader(new ByteArrayInputStream(new String("slow").getBytes()));
        assertEquals(true, inputRea1.hasNext());
        assertEquals(true, inputRea1.hasNext());
    }
}

