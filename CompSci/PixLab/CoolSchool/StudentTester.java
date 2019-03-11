
/**
 * Tests the constructors and methods of Student Class
 * 
 * @author Isaac Blandin 
 * @version February 5, 2019
 */
public class StudentTester
{
    /**
     * main method to test Student class
     */
    public static void main(){
        //testStudentConstructors();
        testGetFirstName();
        testGetLastName();
        testGetLocker();
        testGetGradYear();
        testSetFirstName();
        testSetLastName();
        testSetLocker();
        testSetGradYear();
    }
    
    /**
     * test the constructors of the student class
     */
    public static void testStudentConstructors(){
        //testing Student() constructor
        Student student1 = new Student();
        System.out.println("student first name shoud be   and is " + student1.getFirstName());
        System.out.println("student last name shoud be   and is " + student1.getLastName());
        System.out.println("student locker number shoud be 0 and is " + student1.getLocker());
        System.out.println("student grad year shoud be 0 and is " + student1.getGradYear());
        
        //testing Student(String fName, String lName)
        Student student2 = new Student("Emilie", "Butler");
        System.out.println("student first name shoud be \"Emilie\" and is \'" + student2.getFirstName() + "\"");
        System.out.println("student last name shoud be \"Butler\" and is \"" + student2.getLastName() + "\"");
        System.out.println("student locker number shoud be 0 and is " + student2.getLocker());
        System.out.println("student grad year shoud be 0 and is " + student2.getGradYear());
        
        //testing Student(String fName. String lName, int locker, int gradYr)
        Student student3 = new Student("Emilie", "Butler", 5, 2021);
        System.out.println("student first name shoud be \"Emilie\" and is \"" + student3.getFirstName() + "\"");
        System.out.println("student last name shoud be \"Butler\" and is \"" + student3.getLastName() + "\"");
        System.out.println("student locker number shoud be 5 and is " + student3.getLocker());
        System.out.println("student grad year shoud be 2021 and is " + student3.getGradYear());
    }
    
    /**
     * tests the getFirstName method
     */
    public static void testGetFirstName(){
        Student student1 = new Student("Austin", "Kerr");
        System.out.println("Student First name should be \"Austin\" and is \"" + student1.getFirstName() + "\"");
    }
    
    /**
     * tests the getLastName method
     */
    public static void testGetLastName(){
        Student student1 = new Student("Austin", "Kerr");
        System.out.println("Student Last name should be \"Kerr\" and is \"" + student1.getLastName() + "\"");
    }
    
    /**
     * tests the getLocker method
     */
    public static void testGetLocker(){
        Student student1 = new Student("Austin", "Kerr", 5, 2009);
        System.out.println("Student locker number should be 5 and is " + student1.getLocker());
    }
    
    /**
     * tests the getGradYear method
     */
    public static void testGetGradYear(){
        Student student1 = new Student("Austin", "Kerr", 5, 2009);
        System.out.println("Student grad year should be 2009 and is" + student1.getGradYear());
    }
    
    /**
     * tests the setFirstName method
     */
    public static void testSetFirstName(){
        Student student1 = new Student("wrong", "Kerr");
        student1.setFirstName("Isaac");
        System.out.println("Student First name should be \"Isaac\" and is \"" + student1.getFirstName() + "\"");
    }
    
    /**
     * tests the setLastName method
     */
    public static void testSetLastName(){
        Student student1 = new Student("Austin", "wrong");
        student1.setLastName("Blandin");
        System.out.println("Student Last name should be \"Blandin\" and is \"" + student1.getLastName() + "\"");
    }
    
    /**
     * tests the setLocker method
     */
    public static void testSetLocker(){
        Student student1 = new Student("Austin", "Kerr", 5, 2009);
        student1.setLocker(8);
        System.out.println("Student locker number should be 8 and is " + student1.getLocker());
    }
    
    /**
     * tests the setGradYear method
     */
    public static void testSetGradYear(){
        Student student1 = new Student("Austin", "Kerr", 5, 2009);
        student1.setGradYear(2021);
        System.out.println("Student grad year should be 2021 and is" + student1.getGradYear());
    }
    
    /**
     * tests the getStudentID method
     */
    public static void testGetStudentID(){
        Student student1 = new Student("Austin", "Kerr", 5, 2009);
        Student student2 = new Student();
        Student student3 = new Student("Isaac", "Blandin");
        Student student4 = new Student();
        System.out.println("student ID should be 1000 and is " + student1.getStudentID());
        System.out.println("student ID should be 1001 and is " + student2.getStudentID());
        System.out.println("student ID should be 1002 and is " + student3.getStudentID());
        System.out.println("student ID should be 1003 and is " + student4.getStudentID());
    }
}
