
/**
 * Princpal is a type of employee
 * 
 * @author Isaac Blandin 
 * @version February 18, 2019
 */
public class Principal extends Employee
{
    private String title = "";
    private String building = "";
    
    /**
     * constructs a principal with an id number
     */
    public Principal(){
        
    }
    
    /**
     * constructs a principal with a first name, last name, id number, 
     * title, and building
     * 
     * @param firstName first name of the principal
     * @param lastName last name of the principal
     * @param title title of the principal
     * @param building building the principal works in
     */
    public Principal(String firstName, String lastName, String title, String building){
        super(firstName, lastName);
        this.title = title;
        this.building = building;
    }
    
    /**
     * gets the title of the principal
     * 
     * @return String title of the principal
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * gets the building of the principal
     * 
     * @return String building of the principal
     */
    public String getBuilding(){
        return building;
    }
    
    /**
     * sets the title of the principal
     * 
     * @param title title of the principal
     */
    public void setTitle(String title){
        this.title = title;
    }
    
    /**
     * sets the building of the principal
     * 
     * @param building building the principal works in
     */
    public void setBuilding(String building){
        this.building = building;
    }
    
    /**
     * returns a string description of the principal
     * 
     * @return String description of the principal
     */
    public String toString(){
        String desc = super.toString();
        desc += ", Title: " + title;
        desc += ", Building: " + building;
        
        return desc;
    }
}
