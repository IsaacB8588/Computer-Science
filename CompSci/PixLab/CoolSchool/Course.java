
/**
 * Write a description of class Course here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Course
{
    private String name;
    private int courseID;
    private int roomNumber;
    private String teacher;
    ArrayList<Student> roster = new ArrayList<Student>();
    
    /**
     * constucts a course with a name and Id
     * 
     * @param name name of the course
     * @param id id number of the course
     */
    public Course(String name, int id){
        this.name = name;
        courseID = id;
        roomNumber = 0;
        
    }
    
    /**
     * constucts a course with a name, id, and room number
     * 
     * @param name name of course
     * @param id id number of the course
     * @param roomNum the room number of the course
     */
    public Course(String name, int id, int roomNum){
        this.name = name;
        courseID = id;
        roomNumber = roomNum;
        
    }
    
    /**
     * sets the name of the course
     * 
     * @param name the name to be set to the course
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * sets the id of the course
     * 
     * @param id the id to be set to the course
     */
    public void setID(int id){
        courseID = id;
    }
    
    /**
     * sets the room number of the course
     * 
     * @param roomNum the room number to be set to the course
     */
    public void setRoomNum(int roomNum){
        roomNumber = roomNum;
    }
    
    /**
     * sets the teacher of the course
     * 
     * @param teacher the name of the teacher to be set to the course
     */
    public void setTeacher(String teacher){
        this.teacher = teacher;
    }
    
    /**
     * gets the name of the course
     * 
     * @return String - the name of the course
     */
    public String getName(){
        return name;
    }
    
    /**
     * gets the id of the course
     * 
     * @return int - the id of the course
     */
    public int getID(){
        return courseID;
    }
    
    /**
     * gets the room number of the course
     * 
     * @return int - the room number of the course
     */
    public int getRoomNumber(){
        return roomNumber;
    }
    
    /**
     * gets the teacher name of the course
     * 
     * @return String - name the teacher of the course
     */
    public String getTeacher(){
        return teacher;
    }
    
    /**
     * adds a student to the roster
     */
    public void addStudent(Student a){
        roster.add(a);
    }
    
    /**
     * gets a student from a roster
     * 
     * @param i int - position of student to be returned
     * 
     * @return Student - student to be retrieved 
     */
    public Student getStudent(int i){
        return roster.get(i);
    }
    
    /**
     * gets a student from a roster
     * 
     * @param pos int - position of student to be removed
     */
    public void removeStudent(int pos){
        roster.remove(pos);
    }
    
    /**
     * displays students on a roster
     */
    public void printRoster(){
        for(int i = 0; i < roster.size(); i++){
            System.out.println(i + " " + roster.get(i).getFirstName() + " " + roster.get(i).getLastName() + " " + roster.get(i).getStudentID());
        }
    }
    
    /**
     * sorts roster alphabetically
     */
    public void alphaSortRoster(){
        for(int i = 0; i < roster.size() - 1; i++){
            for(int j = i + 1; j < roster.size(); j++){
                if(roster.get(i).getLastName().compareToIgnoreCase(roster.get(j).getLastName()) > 0){
                    Student a = roster.get(i);
                    roster.set(i, roster.get(j));
                    roster.set(j, a);
                }
                if(roster.get(i).getLastName().compareToIgnoreCase(roster.get(j).getLastName()) == 0){
                    if(roster.get(i).getFirstName().compareToIgnoreCase(roster.get(j).getFirstName()) > 0){
                        Student a = roster.get(i);
                        roster.set(i, roster.get(j));
                        roster.set(j, a);
                    }
                }
            }
        }
    }
    
    /**
     * sorts roster by id number
     */
    public void idSortRoster(){
        for(int i = 0; i < roster.size() - 1; i++){
            for(int j = i + 1; j < roster.size(); j++){
                if(roster.get(i).getStudentID() > roster.get(j).getStudentID()){
                    Student a = roster.get(i);
                    roster.set(i, roster.get(j));
                    roster.set(j, a);
                }
            }
        }
    }
    
    
}
