
/**
 * Write a description of class CourseTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CourseTester
{
    public static void main(){
        testCourseConstructors();
        testGetName();
        testGetID();
        testGetRoomNumber();
        testSetName();
        testSetID();
        testSetRoomNum();
    }
    
    /**
     * tests the course constuctors
     */
    public static void testCourseConstructors(){
        //testing Course(String name, int ID) constructor
        Course course1 = new Course("Math", 12);
        //check results
        System.out.println("course name should be \"Math\" and is \"" + course1.getName() + "\"");
        System.out.println("course ID should be 12 and is " + course1.getID());
        
        //testing Course(String name, int ID, int roomNum) constructor
        Course course2 = new Course("Chem", 14, 215);
        //check results
        System.out.println("course name should be \"Chem\" and is \"" + course2.getName() + "\"");
        System.out.println("course ID should be 14 and is " + course2.getID());
        System.out.println("course room number should be 215 and is " + course2.getRoomNumber());
    }
    
    /**
     * tests the getName method
     */
    public static void testGetName(){
        //constructs the course
        Course course1 = new Course("Wrong", -1);
        //check results
        System.out.println("course name should be \"Wrong\" and is \"" + course1.getName() + "\"");
    }
    
    /**
     * tests the getID method
     */
    public static void testGetID(){
        //constructs the course
        Course course1 = new Course("Wrong", -1);
        //check results
        System.out.println("course ID should be -1 and is " + course1.getID());
    }
    
    /**
     * tests the getRoomNumber method
     */
    public static void testGetRoomNumber(){
        //constructs the course
        Course course1 = new Course("Wrong", -1, 125);
        //check results
        System.out.println("course room number should be 125 and is " + course1.getRoomNumber());
    }
    
    /**
     * tests the setName method
     */
    public static void testSetName(){
        //constructs the course
        Course course1 = new Course("Wrong", -1);
        //changes course Name
        course1.setName("Correct");
        //check results
        System.out.println("course name should be \"Correct\" and is \"" + course1.getName() + "\"");
    }
    
    /**
     * tests the setID method
     */
    public static void testSetID(){
        //constructs the course
        Course course1 = new Course("Wrong", -1);
        //changes course ID
        course1.setID(2);
        //check results
        System.out.println("course ID should be 2 and is " + course1.getID());
    }
    
    /**
     * tests the setRoomNum method
     */
    public static void testSetRoomNum(){
        //constructs the course
        Course course1 = new Course("Wrong", -1, 125);
        //changes room number
        course1.setRoomNum(256);
        //check results
        System.out.println("course room number should be 256 and is " + course1.getRoomNumber());
    }
    
    /**
     * tests the addStudent method
     */
    public static void testAddStudent(){
        //constructs course
        Course course1 = new Course("Comp Sci", 1);
        //constructs student
        Student a = new Student("Emilie", "Butler");
        course1.addStudent(a);
        System.out.println("New Student should be \"Emilie Butler\" with a new ID: " + course1.getStudent(0).getFirstName() + " "
        + course1.getStudent(0).getLastName() + " " + course1.getStudent(0).getStudentID());
        
        
    }
    
    /**
     * tests printRoster() method
     */
    public static void testPrintRoster(){
        Course course1 = new Course("Comp Sci", 1);
        Student a = new Student("Emilie", "Butler");
        Student b = new Student("Austin", "Kerr");
        Student c = new Student("Zach", "Hinkle");
        Student d = new Student("Isaac", "Blandin");
        Student e = new Student("Cam", "Lee");
        Student f = new Student("Tanner", "Naeve");
        course1.addStudent(a);
        course1.addStudent(b);
        course1.addStudent(c);
        course1.addStudent(d);
        course1.addStudent(e);
        course1.addStudent(f);
        course1.printRoster();
    }
    
    /**
     * tests removeStudent() method
     */
    public static void testRemoveStudent(){
        Course course1 = new Course("Comp Sci", 1);
        Student a = new Student("Emilie", "Butler");
        Student b = new Student("Austin", "Kerr");
        Student c = new Student("Zach", "Hinkle");
        Student h = new Student("Gentry", "McEwen");
        Student d = new Student("Isaac", "Blandin");
        Student e = new Student("Cam", "Lee");
        Student f = new Student("Tanner", "Naeve");
        course1.addStudent(a);
        course1.addStudent(b);
        course1.addStudent(c);
        course1.addStudent(h);
        course1.addStudent(d);
        course1.addStudent(e);
        course1.addStudent(f);
        course1.printRoster();
        course1.removeStudent(3);
        course1.printRoster();
    }
    
    /**
     * tests alphaSortRoster() method
     */
    public static void testAlphaSortRoster(){
        Course course1 = new Course("Comp Sci", 1);
        Student a = new Student("Emilie", "Butler");
        Student b = new Student("Austin", "Kerr");
        Student c = new Student("Zach", "Hinkle");
        Student h = new Student("Zam", "Blandin");
        Student d = new Student("Isaac", "Blandin");
        Student e = new Student("Cam", "Lee");
        Student f = new Student("Tanner", "Naeve");
        course1.addStudent(a);
        course1.addStudent(b);
        course1.addStudent(c);
        course1.addStudent(h);
        course1.addStudent(d);
        course1.addStudent(e);
        course1.addStudent(f);
        course1.printRoster();
        
        course1.alphaSortRoster();
        course1.printRoster();
    }
    
    /**
     * tests idSortRoster() method
     */
    public static void testIDSortRoster(){
        Course course1 = new Course("Comp Sci", 1);
        Student a = new Student("Emilie", "Butler");
        Student b = new Student("Austin", "Kerr");
        Student c = new Student("Zach", "Hinkle");
        Student h = new Student("Gentry", "McEwen");
        Student d = new Student("Isaac", "Blandin");
        Student e = new Student("Cam", "Lee");
        Student f = new Student("Tanner", "Naeve");
        course1.addStudent(a);
        course1.addStudent(b);
        course1.addStudent(c);
        course1.addStudent(h);
        course1.addStudent(d);
        course1.addStudent(e);
        course1.addStudent(f);
        
        course1.alphaSortRoster();
        course1.printRoster();
        
        course1.idSortRoster();
        course1.printRoster();
    }
}
