
/**
 * This class tests the getters and setters present in Person class.
 * 
 * @author (Javier)
 * @version (270918)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    /**
     * Returns true if the basic gender related methods in Person pass a series of tests (setGender, getGender).
     * @return boolean True passes the test, false otherwise.
     */
    public boolean testGender()
    {
        //Set true as the value for the gender field.
        //Retrueve the value for the gender field and check that it is true.
        Person dummy;
        dummy = new Person();
        
        //T1: true
        dummy.setGender(true);
        if (dummy.getGender() != true)
        { 
            System.out.println ("T1 failed");
            return false; //Test failed
        }
        
        //T2: false
        dummy.setGender(false);
        if (dummy.getGender() != false)
        {
            System.out.println ("T2 failed");
            return false; //Test failed
        }
        
        //T3: MALE_VALUE
        dummy.setGender(Person.MALE_VALUE);
        if (dummy.getGender() != (Person.MALE_VALUE))
        {
            System.out.println ("T3 failed");
            return false; //Test failed
        }
        
        //T4: FEMALE_VALUE
        dummy.setGender(Person.FEMALE_VALUE);
        if (dummy.getGender() != (Person.FEMALE_VALUE))
        {
            System.out.println ("T4 failed");
            return false; //Test failed
        }
        return true; //All tests passed
    }
    
    /** 
     * Returns true if the isAGirl passes a series of tests
     * @return boolean True pass the tests,false otherwise
     */
    public boolean testIsAGirl()
    {
        //Sets different values for the gender field.
        //Verifies that the isAGirl method returns the right values
        
        Person dummy = new Person();
        
        //T1
        dummy.setGender(Person.MALE_VALUE);
        if (dummy.isAGirl() != false)
        {
            System.out.println ("T1 failed");
            return false; //Test failed
        }
    
        //T2
        dummy.setGender (Person.FEMALE_VALUE);
        if (!dummy.isAGirl())
        {
            System.out.println  ("T2 failed");
            return false; //Test failed
        }
        return true; //All test passed
    }
    
    /**
     * Returns true if all the test methods return true. False if at least one method returns false.
     * @return True all testing methods return true. False otherwise
     */
    public boolean testAll()
    {
        /* 
        if (testGender() == true && testIsAGirl() == true)
            return true; //All tests passed
        else
            return false; //Tests failed
        */
       
        /*
        
        if (testGender() == true && testIsAGirl() == true)
            return true; //All tests passed
        else
            return false; //Tests failed
        */
       
        return testGender() && testIsAGirl();
    }
}

