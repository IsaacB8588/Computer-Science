
/**
 * Write a description of class Employee here.
 * 
 * @author Isaac Blandin 
 * @version February 18, 2019
 */
public class Employee implements Person
{
    private String fName = "";
    private String lName = "";
    private int iDNumber;
    private static int ID = 1;
    
    /**
     * constructs an employee with an ID number
     */
    public Employee (){
        iDNumber = ID;
        ID++;
    }
    
    /**
     * constructs an employee with a first name, last name, and ID number
     * 
     * @param fName the first name of the employee
     * @param lName the last name of the employee
     */
    public Employee (String fName, String lName){
        this.fName = fName;
        this.lName = lName;
        iDNumber = ID;
        ID++;
    }
    
    /**
     * gets first name of the employee
     * 
     * @return String first name
     */
    public String getFirstName(){
        return fName;
    }
    
    /**
     * gets last name of the employee
     * 
     * @return String last name
     */
    public String getLastName(){
        return lName;
    }
    
    /**
     * gets the id number of the employee
     * 
     * @return int id number
     */
    public int getIDNumber(){
        return iDNumber;
    }
    
    /**
     * sets first name of the employee
     * 
     * @param fName first name
     */
    public void setFirstName(String fName){
        this.fName = fName;
    }
    
    /**
     * sets last name of the employee
     * 
     * @param lName last name
     */
    public void setLastName(String lName){
        this.lName = lName;
    }
    
    /** 
     * returns a string describing the employee
     * 
     * @return String description of the employee first name,
     * last name, and id number
     */
    public String toString(){
        return fName + " " + lName + ", " + iDNumber; 
    }
}
