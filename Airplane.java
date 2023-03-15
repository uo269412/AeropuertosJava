
/**
 * This class models aircraft in an Air Controller simulator.
 *
 * @author (Javier)
 * @version (071018)
 */
public class Airplane
{
    // Constant section
    
    final static int X_WEST_BORDER = 0;
    final static int X_EAST_BORDER = 10;
    final static int Y_NORTH_BORDER = 0;
    final static int Y_SOUTH_BORDER = 10;
    
    final static int X_MAX_SPEED = 1;
    final static int X_MIN_SPEED = -1;
    final static int Y_MAX_SPEED = 1;
    final static int Y_MIN_SPEED = -1;
    final static double MIN_ALTITUDE = 0;
    final static double MIN_FUEL = 0;
    
    // Field section
    
    char ID; //identificator for the airplane ( "a", "b", "c")
    double fuel; //amount of fuel in tons (can't be negative)
    double altitude; //current altitude in km
    int xPos; //x-coordinate ([0, 10])
    int yPos; //y-coordinate (same as xPos)
    int xSpeed; //x-speed for the plane ([-1, 0, 1])
    int ySpeed; //y-speed for the plane (same as xSpeed)
    
    // Constructors
    
    /** 
     *  Constructor of objects of Airplane class
     */
    public Airplane ()
    {
        setID('a');
        setFuel(0);
        setAltitude(0);
        setXPos(0);
        setYPos(0);
        setXSpeed(0);
        setYSpeed(0);
    }
    
    /** 
     *  Constructor of objects of Airplane class
     *  @param char value for the identificator of the plane
     */
    public Airplane (char ID)
    {
        this();
        setID(ID);
    }
    
    /** 
     *  Constructor of objects of Airplane class
     *  @param char value for the identificator of the plane
     *  @param double value for the amount of fuel
     *  @param double value for the current altitude
     *  @param int value for the position in the x-coordinate
     *  @param int value for the position in the y-coordinate
     *  @param int value for the speed in the x axis
     *  @param int value for the speed in the y axis
     */
    public Airplane (char ID, double fuel, double altitude,int xPos, int yPos, int xSpeed, int ySpeed)
    {
        setID(ID);
        setFuel(fuel);
        setAltitude(altitude);
        setXPos(xPos);
        setYPos(yPos);
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }
    
    // Setters
    
    /**
     * This code changes the ID value
     * @param char containing the ID value
     */
    public void setID(char ID)
    {
        this.ID = ID;
    }
    
    /**
     * This code changes the fuel value
     * @param double containing the amount of fuel value. It can't be negative
     */
    public void setFuel (double fuel)
    {
        if (fuel < 0)
            throw new RuntimeException ("Fuel can't have a negative value assigned");
        else
            this.fuel = fuel;
    }
    
    /**
     * This code changes the altitude value
     * @param double containing the altitude value. It can't be negative
     */
    public void setAltitude (double altitude)
    {
        if (altitude < 0)
            throw new RuntimeException ("Altitude can't have a negative value assigned");
        else
            this.altitude = altitude;
    }
    
    /**
     * This code changes the xPos value
     * @param int containing the x-coordinate position. It has to be a value between both space borders
     */
    public void setXPos(int xPos)
    {
        if (xPos < X_WEST_BORDER || xPos > X_EAST_BORDER)
            throw new RuntimeException ("It must be a value between both space borders");
        else
            this.xPos = xPos;
    }
    
    /**
     * This code changes the yPos value
     * @param int containing the y-coordinate position. It has to be a value between both space borders
     */
    public void setYPos (int yPos)
    {
        if (yPos < Y_NORTH_BORDER || yPos > Y_SOUTH_BORDER)
            throw new RuntimeException ("It must be a value between both space border");
        else
            this.yPos = yPos;
    }
    
    /**
     * This code changes the xSpeed value
     * @param int containing the x-speed for the plane. It has to 0, -1 or 1
     */
    public void setXSpeed (int xSpeed)
    {
        if (xSpeed >= -1 && ySpeed <= 1)
            this.xSpeed = xSpeed;
        else
            throw new RuntimeException ("The speed has to be either a -1, a 0 or a 1");
    }
    
    /**
     * This code changes the ySpeed value
     * @param int containing the y-speed for the plane. It has to 0, -1 or 1
     */
    public void setYSpeed (int ySpeed)
    {
        if (ySpeed >= -1 && ySpeed <= 1)
            this.ySpeed = ySpeed;
        else
            throw new RuntimeException ("The speed has to be either a -1, a 0 or a 1");
    }
    
    // Getters
    
    /** This code displays the ID value
     * @return char containing the current ID value
     */
    public char getID ()
    {
        return ID;
    }
    
    /** This code displays the fuel value
     * @return double containing the current fuel value
     */
    public double getFuel ()
    {
        return fuel;
    }
    
    /** This code displays the altitude value
     * @return double containing the current altitude value
     */
    public double getAltitude()
    {
       return altitude;
    }
    
    /** This code displays the x-coordinate value
     * @return int containing the current xPos value
     */
    public int getXPos()
    {
        return xPos;
    }
    
    /** This code displays the y-coordinate value
     * @return int containing the current yPos value
     */
    public int getYPos()
    {
        return yPos;
    }
    
    /** This code displays the x-speed value
     * @return int containing the current xSpeed value
     */
    public int getXSpeed()
    {
        return xSpeed;
    }
    
    /** This code displays the y-speed value
     * @return int containing the current ySpeed value
     */
    public int getYSpeed()
    {
        return ySpeed;
    }
    
    // Other methods
    
    /**
     * Returns a string including different attributes of the object
     * @return string with all the values of the class
     */
    public String toString()
    {
        return "ID: " + getID() + " - Fuel: " + getFuel() + " - Altitude: " + getAltitude () + " - POS: [" + getXPos() + "," + getYPos() + "] - Speed: [" + getXSpeed() + "," + getYSpeed() + "]";
    }
    
    /**
     * Prints the information provided
     * (the information is formatted in the computer's display)
     */
    public void print()
    {
       System.out.print("ID: "+ getID());
       System.out.print(" - Fuel: "+ getFuel());
       System.out.print(" - Altitude: "+ getAltitude());
       System.out.print(" - POS: ["+ getXPos());
       System.out.print("," + getYPos());
       System.out.print("] - Speed: [" + getXSpeed());
       System.out.print("," + getYPos());
       System.out.print("]");
    }
}
