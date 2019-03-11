
/**
 * object to represent a dog
 * 
 * @author Isaac Blandin
 * @version February 14, 2019
 */
public class Dog
{
    private String name; //name of the dog
    private String breed; //breed of the dog
    private String gender; //gender of the dog
    private int dogID; // id number of the dog
    private static int ID = 100; // lowest possible id number 
    
    /**
     * Constructs a Dog with an ID number
     */
    public Dog(){
        name = "";
        breed = "";
        gender = "";
        dogID = ID;
        ID++;
    }
    
    /**
     * Constructs a Dog with a name, breed, gender, and ID
     * 
     * @param name name of the dog
     * @param breed breed of the dog
     * @param gender gender of the dog
     */
    public Dog(String name, String breed, String gender){
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        dogID = ID;
        ID++;
    }
    
    /**
     * returns the name of the dog
     * 
     * @return String - name of the dog
     */
    public String getName(){
        return name;
    }
    
    /**
     * returns the breed of the dog
     * 
     * @return String - breed of the dog
     */
    public String getBreed(){
        return breed;
    }
    
    /**
     * returns the gender of the dog
     * 
     * @return String - gender of the dog
     */
    public String getGender(){
        return gender;
    }
    
    /**
     * returns the Id number of the dog
     * 
     * @return int - id number of the dog
     */
    public int getID(){
        return dogID;
    }
    
    /**
     * sets the name of the dog
     * 
     * @param name name of the dog
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * sets the breed of the dog
     * 
     * @param breed breed of the dog
     */
    public void setBreed(String breed){
        this.breed = breed;
    }
    
    /**
     * sets the gender of the dog
     * 
     * @param gender gender of the dog
     */
    public void setGender(String gender){
        this.gender = gender;
    }
    
    /**
     * returns a string of all of the dog information
     * 
     * @return String - dog info
     */
    public String toString(){
        String ret = name + ", " + breed + ", " + gender + ", " + dogID;
        return ret;
    }
}


