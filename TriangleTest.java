

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TriangleTest.
 *
 * @author  (Javier)
 * @version (071018)
 */
public class TriangleTest
{
    @Test
    /**
     * Tests the computeArea method, checking if it works and trying out values that would fail
     */
    public void testComputeArea()
    {
        Triangle dummy = new Triangle();
        assertEquals(0, dummy.computeArea(0, 0), 0.1);
        assertEquals(0, dummy.computeArea(0, 10), 0.1);
        assertEquals(0, dummy.computeArea(10, 0), 0.1);
        assertEquals(50, dummy.computeArea(10,10), 0.1);
        assertEquals(0, dummy.computeArea(100, 0), 0.1);
        assertEquals(0, dummy.computeArea(0, 100), 0.1);
        assertEquals(5000, dummy.computeArea(100, 100), 0.1);
        try
        {
            assertEquals(0.5, dummy.computeArea(-1, -1), 0.1);
            fail();
        }
        catch (Exception ex)
        {
            assertEquals(5000, dummy.computeArea(100,100), 0.1);
        }
        try
        {
            assertEquals(0.5, dummy.computeArea(-1, 1), 0.1);
            fail();
        }
        catch (Exception ex)
        {
            assertEquals(5000, dummy.computeArea(100,100), 0.1);
        }
        try
        {
            assertEquals(0.5, dummy.computeArea(1, -1), 0.1);
            fail();
        }
        catch (Exception ex)
        {
            assertEquals(5000, dummy.computeArea(100,100), 0.1);
        }
        try
        {
            assertEquals(0.5, dummy.computeArea(-100, -100), 0.1);
            fail();
        }
        catch (Exception ex)
        {
            assertEquals(5000, dummy.computeArea(100,100), 0.1);
        }
        try
        {
            assertEquals(0.5, dummy.computeArea(-100, 1), 0.1);
            fail();
        }
        catch (Exception ex)
        {
            assertEquals(5000, dummy.computeArea(100,100), 0.1);
        }
        try
        {
            assertEquals(0.5, dummy.computeArea(1, -100), 0.1);
            fail();
        }
        catch (Exception ex)
        {
            assertEquals(5000, dummy.computeArea(100,100), 0.1);
        }
    }
}

