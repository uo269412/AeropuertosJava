
/**
 * Computes the area of a trianlge from its base and height.
 * 
 * @author (Javier) 
 * @version (170918)
 */
public class Triangle

{
    
/**
 * Constructor for objects of class Triangle
 */
 public Triangle()
 {
        
 }
 
/**
 * Obtain the area of this triangle from its base and height (given in meters)
 * 
 * @param double with the height of the triangle (in meters). No negative values are accepted.
 * @param double base of the triangle (in meters). No negative values are accepted.
 * @return double containing the area of the triangle (in squared meters).
 */
public double computeArea(double height, double base)
{
    if (height >= 0 && base >= 0)
        return (height * base)/2;
    else
        throw new RuntimeException ("Neither height nor base can be negative values");
}
}
