

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AirplaneTest.
 *
 * @author  (Javier)
 * @version (081018)
 */
public class AirplaneTest
{
    @Test
    /**
     * Tests the setID and getID methods, checking if they work
     */
    public void testID()
    {
        Airplane dummy = new Airplane();
        dummy.setID('x');
        assertEquals('x', dummy.getID());
    }

    @Test
    /**
     * Tests the setFuel and getFuel methods, checking if they work
     */
    public void testFuel()
    {
        Airplane dummy = new Airplane();
        dummy.setFuel(Airplane.MIN_FUEL);
        assertEquals(Airplane.MIN_FUEL, dummy.getFuel(), 0.01);
        dummy.setFuel(Airplane.MIN_FUEL+50);
        assertEquals(Airplane.MIN_FUEL+50, dummy.getFuel(), 0.01);
        dummy.setFuel(Airplane.MIN_FUEL+100);
        assertEquals(Airplane.MIN_FUEL+100, dummy.getFuel(), 0.01);
        try
        {
            dummy.setAltitude(Airplane.MIN_FUEL-1);
            fail(); 
        }
        catch (Exception ex)
        {
            assertEquals(100, dummy.getFuel(), 0.01);
        }
        try
        {
            dummy.setAltitude(Airplane.MIN_FUEL-300);
            fail(); 
        }
        catch (Exception ex)
        {
            assertEquals(100, dummy.getFuel(), 0.01);
        }
    }
    
    @Test
    /**
     * Tests the setAltitude and getAltitude methods, checking if they work and trying out values that would fail
     */
    public void testAltitude()
    {
        Airplane dummy= new Airplane();
        dummy.setAltitude(Airplane.MIN_ALTITUDE);
        assertEquals(Airplane.MIN_ALTITUDE, dummy.getAltitude(), 0.01);
        dummy.setAltitude(Airplane.MIN_ALTITUDE+50);
        assertEquals(Airplane.MIN_ALTITUDE+50, dummy.getAltitude(), 0.01);
        dummy.setAltitude(Airplane.MIN_ALTITUDE+100);
        assertEquals(Airplane.MIN_ALTITUDE+100, dummy.getAltitude(), 0.01);
        try
        {
            dummy.setAltitude(Airplane.MIN_ALTITUDE-1);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(100, dummy.getAltitude(), 0.01);
        }
        try
        {
            dummy.setAltitude(Airplane.MIN_ALTITUDE-300);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(100, dummy.getAltitude(), 0.01);
        }
    }
    
    @Test
    /**
     * Tests the setXPos and getXPos methods, checking if they work and trying out values that would fail
     */
    public void testXPos()
    {
        Airplane dummy = new Airplane();
        dummy.setXPos(Airplane.X_WEST_BORDER);
        assertEquals(Airplane.X_WEST_BORDER, dummy.getXPos());
        dummy.setXPos(Airplane.X_EAST_BORDER/2);
        assertEquals(Airplane.X_EAST_BORDER/2, dummy.getXPos());
        dummy.setXPos(Airplane.X_EAST_BORDER);
        assertEquals(Airplane.X_EAST_BORDER, dummy.getXPos());
        try
        {
            dummy.setXPos(Airplane.X_WEST_BORDER-1);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Airplane.X_EAST_BORDER, dummy.getXPos());
        }
        try
        {
            dummy.setXPos(Airplane.X_WEST_BORDER-300);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Airplane.X_EAST_BORDER, dummy.getXPos());
        }
        try
        {
            dummy.setXPos(Airplane.X_EAST_BORDER+1);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Airplane.X_EAST_BORDER, dummy.getXPos());
        }
        try
        {
            dummy.setXPos(Airplane.X_EAST_BORDER+300);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Airplane.X_EAST_BORDER, dummy.getXPos());
        }
    }

    @Test
    /**
     * Tests the setYPos and getYPos methods, checking if they work and trying out values that would fail
     */
    public void testYPos()
    {
        Airplane dummy = new Airplane();
        dummy.setYPos(Airplane.Y_NORTH_BORDER);
        assertEquals(Airplane.Y_NORTH_BORDER, dummy.getYPos());
        dummy.setYPos(Airplane.Y_SOUTH_BORDER/2);
        assertEquals(Airplane.Y_SOUTH_BORDER/2, dummy.getYPos());
        dummy.setYPos(Airplane.Y_SOUTH_BORDER);
        assertEquals(Airplane.Y_SOUTH_BORDER, dummy.getYPos());
        try
        {
            dummy.setYPos(Airplane.Y_NORTH_BORDER-1);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Airplane.Y_SOUTH_BORDER, dummy.getYPos());
        }
        try
        {
            dummy.setYPos(Airplane.Y_NORTH_BORDER-300);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Airplane.Y_SOUTH_BORDER, dummy.getYPos());
        }
        try
        {
            dummy.setYPos(Airplane.Y_SOUTH_BORDER+1);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Airplane.Y_SOUTH_BORDER, dummy.getYPos());
        }
        try
        {
            dummy.setYPos(Airplane.Y_SOUTH_BORDER+300);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Airplane.Y_SOUTH_BORDER, dummy.getYPos());
        }
    }
    
    @Test
    /**
     * Tests the setXSpeed and getXSpeed methods, checking if they work and trying out values that would fail
     */
    public void testXSpeed()
    {
        Airplane dummy = new Airplane();
        dummy.setXSpeed(Airplane.X_MIN_SPEED);
        assertEquals(Airplane.X_MIN_SPEED, dummy.getXSpeed());
        dummy.setXSpeed(Airplane.X_MAX_SPEED/2);
        assertEquals(Airplane.X_MAX_SPEED/2, dummy.getXSpeed());
        dummy.setXSpeed(Airplane.X_MAX_SPEED);
        assertEquals(Airplane.X_MAX_SPEED, dummy.getXSpeed());
        try
        {
            dummy.setYSpeed(Airplane.X_MIN_SPEED-1);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Airplane.X_MAX_SPEED, dummy.getXSpeed());
        }
        try
        {
            dummy.setYSpeed(Airplane.X_MIN_SPEED-300);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Airplane.X_MAX_SPEED, dummy.getXSpeed());
        }
        try
        {
            dummy.setYSpeed(Airplane.X_MAX_SPEED+1);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Airplane.X_MAX_SPEED, dummy.getXSpeed());
        }
        try
        {
            dummy.setYSpeed(Airplane.X_MAX_SPEED+300);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Airplane.X_MAX_SPEED, dummy.getXSpeed());
        }
    }
    
    @Test
    /**
     * Tests the setYSpeed and getYSpeed methods, checking if they work and trying out values that would fail
     */
    public void testYSpeed()
    {
        Airplane dummy = new Airplane();
        dummy.setYSpeed(Airplane.Y_MIN_SPEED);
        assertEquals(Airplane.Y_MIN_SPEED, dummy.getYSpeed());
        dummy.setYSpeed(Airplane.Y_MAX_SPEED/2);
        assertEquals(Airplane.Y_MAX_SPEED/2, dummy.getYSpeed());
        dummy.setYSpeed(Airplane.Y_MAX_SPEED);
        assertEquals(Airplane.Y_MAX_SPEED, dummy.getYSpeed());
        try
        {
            dummy.setYSpeed(Airplane.Y_MIN_SPEED-1);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Airplane.Y_MAX_SPEED, dummy.getYSpeed());
        }
        try
        {
            dummy.setYSpeed(Airplane.Y_MIN_SPEED-300);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Airplane.Y_MAX_SPEED, dummy.getYSpeed());
        }
        try
        {
            dummy.setYSpeed(Airplane.Y_MAX_SPEED+1);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Airplane.Y_MAX_SPEED, dummy.getYSpeed());
        }
        try
        {
            dummy.setYSpeed(Airplane.Y_MAX_SPEED+300);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Airplane.Y_MAX_SPEED, dummy.getYSpeed());
        }
    }

    @Test
    /**
     * Tests the toString method, checking if it works
     */
    public void testToString()
    {
        Airplane dummy = new Airplane();
        dummy.setID('x');
        dummy.setFuel(12.0);
        dummy.setAltitude(7.2);
        dummy.setXPos(2);
        dummy.setYPos(5);
        dummy.setXSpeed(-1);
        dummy.setYSpeed(0);
        assertEquals("ID: " + dummy.getID() + " - Fuel: " + dummy.getFuel() + " - Altitude: " + dummy.getAltitude () + " - POS: [" + dummy.getXPos() + "," + dummy.getYPos() + "] - Speed: [" + dummy.getXSpeed() + "," + dummy.getYSpeed() + "]", dummy.toString());
    }
}









