
/**
 * Student is an object that represents a student in a school
 * 
 * @author Isaac Blandin 
 * @version January 24, 2019
 */

public class Student implements Person
{
    private String firstName; // first name of student
    private String lastName; // last name of student
    private int lockerNum; //locker number of student
    private int gradYear; //year student graduates
    private int studentID;
    private static int ID = 1000;
    
    /**
     * Constructs a Student
     */
    public Student(){
        firstName = "";
        lastName = "";
        lockerNum = 0;
        gradYear = 0;
        studentID = ID;
        ID++;
    }
    
    /**
     * Constructs a Student with first and last name
     * 
     * @param fName the first name of the student
     * @param lName the last name of the student
     */
    public Student(String fName, String lName){
        firstName = fName;
        lastName = lName;
        studentID = ID;
        ID++;
    }
    
    /**
     * Constructs a Student with first name, last name, locker number,
     * and grad year
     * 
     * @param fName the first name of the student
     * @param lName the last name of the student
     * @param locker the locker number of the student
     * @param gradYr the graduation year of the student
     */
    public Student(String fName, String lName, int locker, int gradYr){
        firstName = fName;
        lastName = lName;
        lockerNum = locker;
        gradYear = gradYr;
        studentID = ID;
        ID++;
    }
    
    /**
     * Sets the first name of the student
     * 
     * @param fName String - the first name of the student
     */
    
    public void setFirstName(String fName){
        firstName = fName;
    }
    
    /**
     * gets the first name of the student
     * 
     * @return String - the first name of the student
     */
    
    public String getFirstName(){
        return firstName;
    }
    
    /**
     * Sets the last name of the student
     * 
     * @param fName String - the last name of the student
     */
    
    public void setLastName(String lName){
        lastName = lName;
    }
    
    /**
     * gets the last name of the student
     * 
     * @return String - the last name of the student
     */
    
    public String getLastName(){
        return lastName;
    }
    
    /**
     * sets the locker number of the student
     * 
     * @param locker int - locker number of the student
     */
    
    public void setLocker(int locker){
        lockerNum = locker;
    }
    
    /**
     * gets the locker number of the student
     * 
     * @return int - locker number of the student
     */
    
    public int getLocker(){
        return lockerNum;
    }
    
    /**
     * sets the graduation year of the student
     * 
     * @param gradYr int - grad year of the student
     */
    
    public void setGradYear(int gradYr){
        gradYear = gradYr;
    }
    
    /**
     * gets the graduation year of the student
     * 
     * @return int - grad year of the student
     */
    
    public int getGradYear(){
        return gradYear;
    }
    
    /**
     * gets the students ID number
     * 
     * @return int - id of the student
     */
    public int getStudentID(){
        return studentID;
    }
    
    
    
}
