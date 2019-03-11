
/**
 * Teacher is a type of employee in a school
 * 
 * @author Isaac Blandin 
 * @version February 18, 2019
 */
public class Teacher extends Employee
{
    private int roomNumber = 0;
    private String subject = "";
    
    /**
     * constructs a teacher object that is an employee with
     * an ID number
     */
    public Teacher (){
        
    }
    
    /**
     * constructs a teacher object that is an employee with
     * a first name, last name, id number, room number, and subject
     * 
     * @param firstName first name of the teacher
     * @param lastName last name of the teacher
     * @param roomNumber room number of the teacher's class room
     * @param subject subject taught by the teacher
     */
    public Teacher (String firstName, String lastName, int roomNumber, String subject){
        super(firstName, lastName);
        this.roomNumber = roomNumber;
        this.subject = subject;
    }
    
    /**
     * gets the room number of the teacher
     * 
     * @return int room number of the teacher
     */
    public int getRoomNumber(){
        return roomNumber;
    }
    
    /**
     * gets the subject taught by the teacher
     * 
     * @return String subject taught by the teacher
     */
    public String getSubject(){
        return subject;
    }
    
    /**
     * sets the room number of the teacher
     * 
     * @param roomNumber room number of the teacher
     */
    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }
    
    /**
     * sets the subject taught by the teacher
     * 
     * @param subject subject taught by the teacher
     */
    public void setSubject(String subject){
        this.subject = subject;
    }
    
    /**
     * returns a String description of the teacher
     * 
     * @return String description of the teacher
     */
    public String toString(){
        String desc = super.toString();
        desc = desc + ", room number: " + roomNumber;
        desc = desc + ", subject: " + subject;
        return desc;
    }
}
