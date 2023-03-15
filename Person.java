
/**
 * This class models a person's name, surname, age and gender.
 * 
 * @author (Javier) 
 * @version (120918)
 */
public class Person
{
    // Constant section
    final static boolean FEMALE_VALUE = false;
    final static boolean MALE_VALUE = true;
    final static int MAX_AGE_VALUE = 118;
    final static int MIN_AGE_VALUE= 0;
    final static String FEMALE_TEXT = "Female";
    final static String MALE_TEXT = "Male";
    final static int ADULTHOOD_AGE = 18;
    final static int RETIREMENT_AGE = 100;
    
    
    // Field section
    // If i don't write public/private/protected they are unprotected
    private int x;
    private int age = 18;
    private String name = "Javier";
    private boolean gender = true;
    private String surname = "Carrillo";
    
    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        setName("Yuri");
        setSurname("Gagarin");
        setAge(34);
        setGender(MALE_VALUE);
        System.out.println ("Constructor 1 invoked");
    } 
    
    /** 
     * Constructor for objects of class Person
     * @param int age that the user provides
     */
    public Person(int age)
    {
        this();
        setAge(age);
        System.out.println ("Constructor 2 invoked");
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
     * This code changes the name value
     * @param Established value for the name field
     */
          public void setName(String name)
    {
        this.name=name;//This code changes the name value
    }
    
    /** 
     * This code displays the assigned name value
     * @return Current value for the name field
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * This code changes the surname value
     * @param Established value for the surname field
     */
    public void setSurname(String surname)
    {
        this.surname=surname;
    }
    
    /**
     * This code displays the assigned surname value
     * @return Current value for the surname field
     */
    public String getSurname()
    {
        return surname;
    }
    
    /** 
     * This code changes the gender value
     * @param Established value for the gender field
     */
    public void setGender(boolean gender)
    {
        this.gender=gender;
    }
    
    /** 
     * This code displays the assigned gender value
     * @return Current value for the gender field
     */
    public boolean getGender()
    {
        return gender;
    }
    
    /**
     * This code changes the age value. It only accepts values between 0 and 118. If you try a negative value an error will pop up. If you try a value above 118 it won't be established.
     * @param Established value for the age field. It must be between 0 and 118.
     */
     public void setAge(int age)
    {
     if (age >=0 )
        if (age<=MAX_AGE_VALUE)
            this.age=age;
        else
            throw new RuntimeException("ERROR: You have entered an age above the max age value (118)");
     else //age<0
        throw new RuntimeException("ERROR: The age does not accept negative values");
    }
    
    /** 
     * This code displays the assigned age value
     * @return Current value for the age field
     */
    public int getAge()
    {
        return age;
    }
    
    /** Determines whether the person is a girl. Returns true if she is a girl. Return false if he is a boy.
     * @return boolean True if the gender of this person is female. Otherwise returns false.
     */
    public boolean isAGirl()
    {
        /* The decided in the class room that a value for gender == false meant girls */
        
       if (getGender() == FEMALE_VALUE) //girl
            return true;
       else //boy
            return false;
    }
        
    /**
     * Prints the values of all the fields in the person.
     * (the information is formatted in the computer's display)
     */
    public void printOld()
    {
       System.out.println("Name: "+ getName());
       System.out.println("Surname: "+ getSurname());
       System.out.println("Age: "+ getAge());
       System.out.print("Gender: " + getGenderText());
       /* !isAGirl()
        * isAGirl()!== true
        * gender == MALE_VALUE
        * gender == true
        * getGender() == false
        */
       if (getGender() == MALE_VALUE) //boy
            System.out.print("male");
       else //girl
            System.out.print("female");
    }
    
    /**
     * Prints the values of all the fields in the person.
     * (the information is formatted in the computer's display)
     */
    public void print()
    {
       System.out.println("Name: "+ getName());
       System.out.println("Surname: "+ getSurname());
       System.out.println("Age: "+ getAge());
       System.out.print("Gender: "+ getGenderText());
    }
    
    
    /**
     * Returns a text message with the words "male or "female" depending on the gender of the person
     * @return String containing the words "male" or "female"
     */
    private String getGenderText()
    {
        if (getGender () == MALE_VALUE)
            return (MALE_TEXT);
        else
            return (FEMALE_TEXT);
    }
    
    /**
     * Returns a formatted string that contains the values of all the fields in the class
     * @return String with all the values of the class
     */
    public String toString()
    {
        return "[Name: " + getName() + " - Surname: " + getSurname() + " - Age: " + getAge () + " - Gender: " + getGenderText() + "]";
    }
    
    /**
     * Creates a code (serial number) of the object based on the value of its fields
     * @return String containing the serial number
     */
    public String getHashCode()
    {
        return getName().substring(0,3).toUpperCase() + "-" + getSurname().substring(0,3).toUpperCase() + "-" + getAge()+ "-" + getGender();
    }

    /**
     * Returns the number of years until adulthood if the person is younger than 18, the years before retirement if the person is already and adult, and if the person has retired,
     * the years that have passed since their retirement.
     * @return int number of years until adulthood, until retirement or since retirement
     */
    public int getCriticalAge()
    {
      if (age < ADULTHOOD_AGE)
        return (ADULTHOOD_AGE - getAge());
      else
        if (age < RETIREMENT_AGE)
            return (RETIREMENT_AGE - getAge());
        else
            return (getAge() - RETIREMENT_AGE);
    }
    
    /**
     * Returns true if the age of the user is the same as the one provided
     * @param int given age to be compared with the person age
     * @return boolean showing if the comparation is true or false
     */
    public boolean isYou (int age)
    {
        /* 
        if(age == getAge())
        {
            return true;
        } 
        else
        {
            return false;
        } 
        */
        
        return age == getAge();
    }
    
    /**
     * Returns true if the name of the user is the same as the one provided
     * @param String given name to be compared with the person name
     * @return boolean showing if the comparison is true or false
     */
    public boolean isYou (String name)
    {
       if(getName().compareToIgnoreCase(name)== 0)
        return true;
       else
        return false;
    }
    
    public boolean isYou (Person person)
    /**
     * Returns true if the new person's attributes are the same as the one provided
     * @return boolean showing if the comparison is either true or false
     */
    {
       return getName().compareToIgnoreCase(person.getName()) == 0 &&
       getSurname().compareToIgnoreCase(person.getSurname()) == 0 &&
       getAge() == person.getAge() &&
       getGender() == person.getGender();
    }
    
    public int compareTo (Person person)
    /**
     * Returns 0 if the age of both people are the same, -1 if the host is younger than the person provided and +1 is if the host is older than the one provided as a paramenter
     * @param int given age to be compared with the host age
     * @return int 0 if the age is the same, -1 if the host is younger or +1 if the host is older
     */
    {
        if (person.getAge() == getAge())
            return 0;
            else
        if (person.getAge() < getAge())
            return -1;
            else
            return 1;
    }
}
