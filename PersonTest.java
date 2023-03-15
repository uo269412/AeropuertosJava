

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PersonTest.
 *
 * @author  (Javier)
 * @version (061018)
 */
public class PersonTest
{
    /**
     * Default constructor for test class PersonTest
     */
    public PersonTest()
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
    /**
     * Tests the setGender and getGender methods, checking if they work
     */
    public void testGender()
    {
        Person dummy = new Person();
        dummy.setGender(Person.MALE_VALUE);
        assertEquals(true, dummy.getGender());
        dummy.setGender(Person.FEMALE_VALUE);
        assertEquals(false, dummy.getGender());
    }
    
    @Test
    /**
     * Tests the isAGirl method, checking if it works
     */
    public void testIsAGirl()
    {
        Person dummy = new Person();
        dummy.setGender(Person.MALE_VALUE);
        assertEquals(false, dummy.isAGirl());
        dummy.setGender(Person.FEMALE_VALUE);
        assertEquals(true, dummy.isAGirl());
    }
    
    @Test
    /**
     * Tests the setAge and getAge methods, checking if they work and trying out values that would fail
     */
    public void testAge()
    {
        Person dummy = new Person();
        dummy.setAge(Person.MIN_AGE_VALUE);
        assertEquals(Person.MIN_AGE_VALUE, dummy.getAge());
        dummy.setAge(Person.MAX_AGE_VALUE/2);
        assertEquals(Person.MAX_AGE_VALUE/2, dummy.getAge());
        dummy.setAge(Person.MAX_AGE_VALUE);
        assertEquals(Person.MAX_AGE_VALUE, dummy.getAge());
         try
        {
            dummy.setAge(Person.MIN_AGE_VALUE - 1);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Person.MAX_AGE_VALUE, dummy.getAge());
        }
        try
        {
            dummy.setAge(Person.MIN_AGE_VALUE - 300);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Person.MAX_AGE_VALUE, dummy.getAge());
        }
        try
        {
            dummy.setAge(Person.MAX_AGE_VALUE + 1);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Person.MAX_AGE_VALUE, dummy.getAge());
        
        }
         try
        {
            dummy.setAge(Person.MAX_AGE_VALUE + 300);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Person.MAX_AGE_VALUE, dummy.getAge());
        }
    }
    
    @Test
    /**
     * Tests the setName and getName methods, checking if they work
     */
    public void testName()
    {
        Person dummy = new Person();
        dummy.setName("Javier");
        assertEquals("Javier", dummy.getName());
    }
    
    @Test
    /**
     * Tests the setSurname and getSurname methods, checking if they work
     */
    public void testSurname()
    {
        Person dummy = new Person();
        dummy.setSurname("Carrillo");
        assertEquals("Carrillo", dummy.getSurname());
    }

    @Test
    /**
     * Tests the  getGenderText method, checking if it works
     */
    public void testGenderText()
    {
      Person dummy = new Person();
      dummy.setGender(true);
      assertEquals(Person.MALE_TEXT, "Male");
      dummy.setGender(false);
      assertEquals(Person.FEMALE_TEXT, "Female");
    }

    @Test
    /**
     * Tests the  toString method, checking if it works
     */
    public void testToString()
    {
        Person dummy = new Person();
        dummy.setName("Javier");
        dummy.setSurname("Carrillo");
        dummy.setAge(18);
        dummy.setGender(true);
        assertEquals("[Name: Javier - Surname: Carrillo - Age: 18 - Gender: Male]", dummy.toString());
    }

    @Test
    /**
     * Tests the  getHashCode method, checking if it works
     */
    public void testHashCode()
    {
        Person dummy = new Person();
        dummy.setName("Javier");
        dummy.setSurname("Carrillo");
        dummy.setAge(18);
        dummy.setGender(true);
        assertEquals("JAV-CAR-18-true", dummy.getHashCode());
    }

    @Test
    /**
     * Tests the getCriticalAge method, checking if it works and trying out values that would fail
     */
    public void testCriticalAge()
    {
        Person dummy = new Person();
        dummy.setAge(Person.ADULTHOOD_AGE/2);
        assertEquals(Person.ADULTHOOD_AGE - Person.ADULTHOOD_AGE/2, dummy.getCriticalAge());
        dummy.setAge(Person.ADULTHOOD_AGE);
        assertEquals(Person.RETIREMENT_AGE - Person.ADULTHOOD_AGE, dummy.getCriticalAge());
        dummy.setAge(Person.RETIREMENT_AGE/2);
        assertEquals(Person.RETIREMENT_AGE - Person.RETIREMENT_AGE/2, dummy.getCriticalAge());
        dummy.setAge(Person.RETIREMENT_AGE);
        assertEquals(Person.RETIREMENT_AGE - Person.RETIREMENT_AGE, dummy.getCriticalAge());
        dummy.setAge(Person.RETIREMENT_AGE + 10);
        assertEquals(Person.RETIREMENT_AGE + 10 - Person.RETIREMENT_AGE, dummy.getCriticalAge());
        
        try
        {
            dummy.setAge(Person.MIN_AGE_VALUE - 1);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Person.RETIREMENT_AGE + 10, dummy.getAge());
        }
        try
        {
            dummy.setAge(Person.MIN_AGE_VALUE - 300);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Person.RETIREMENT_AGE + 10, dummy.getAge());
        }
         try
        {
            dummy.setAge(Person.MAX_AGE_VALUE + 1);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Person.RETIREMENT_AGE + 10, dummy.getAge());
        }
        try
        {
            dummy.setAge(Person.MAX_AGE_VALUE + 300);
            fail(); 
        }
         catch (Exception ex)
        {
            assertEquals(Person.RETIREMENT_AGE + 10, dummy.getAge());
        }
    } 
    
    @Test
    /**
     * Tests the isYou method, checking if it works 
     */
    public void testIsYou()
    { 
        Person dummy = new Person();
        dummy.setAge(0);
        assertEquals(true, dummy.isYou(0));
        assertEquals (false, dummy.isYou(Person.MAX_AGE_VALUE));
        
        dummy.setAge(Person.MAX_AGE_VALUE);
        assertEquals(true, dummy.isYou(Person.MAX_AGE_VALUE));
        assertEquals(false,dummy.isYou(0));
    }
    
    @Test
    /**
     * Tests the isYouName method, checking if it works 
     */
    public void testIsYouName()
    { 
        Person dummy = new Person();
        dummy.setName("Neal");
        assertEquals(true, dummy.isYou("Neal"));
        assertEquals (false, dummy.isYou("Buzz"));
        
        dummy.setName("Buzz");
        assertEquals(false, dummy.isYou("Neal"));
        assertEquals(true,dummy.isYou("Buzz"));
        
        dummy.setName("BUZZ");
        assertEquals(false, dummy.isYou("Neal"));
        assertEquals(true,dummy.isYou("Buzz"));
    } 
    
    @Test
    /**
     * Tests the isYouPerson method, checking if it works 
     */
    public void testIsYouPerson()
    {
        Person a = new Person (); // ("Neal", "Armstrong", 40, Person.MALE_VALUE);
        Person b = new Person ();
        
        a.setName("Neal");
        a.setSurname("Armstrong");
        a.setAge(40);
        a.setGender(Person.MALE_VALUE);
        
        b.setName("Valentina");
        b.setSurname("Tereshkova");
        b.setAge(40);
        b.setGender(Person.FEMALE_VALUE);
        
        assertEquals (false, a.isYou(b));
        assertEquals (false, b.isYou(a));
        assertEquals (true, a.isYou(a));
        assertEquals (true, b.isYou(b));
        
        a.setName("Valentina");
        a.setSurname("Tereshkova");
        a.setGender(Person.FEMALE_VALUE);
        
        assertEquals (true, a.isYou(b));
        assertEquals (true, b.isYou(a));
        assertEquals (true, a.isYou(a));
        assertEquals (true, b.isYou(b));
    }
    
    @Test
    /**
     * Tests the compareTo method, checking if it works 
     */
    public void testCompareTo()
    {
        Person a = new Person();
        Person b = new Person();
        a.setAge(0);
        b.setAge(0);
        assertEquals(0, b.compareTo(a));
        assertEquals(0, a.compareTo(b));
        a.setAge(10);
        assertEquals(1, b.compareTo(a));
        assertEquals(-1, a.compareTo(b));
        b.setAge(50);
        assertEquals(-1, b.compareTo(a));
        assertEquals(1, a.compareTo(b));
        
    }
}





   



