
/**
 * Write a description of class DogTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DogTester
{
    public static void main(){
        //testConstructors
        //testSetName;
        //testGetName;
        //testSetBreed;
        //testGetBreed;
        //testSetGender;
        //testGetGender;
        //testGetID;
        //testToString;
    }
    
    /**
     * tests the Dog constructors
     */
    public static void testConstructors(){
        Dog a = new Dog("Fluf", "Poodle", "M");
        System.out.println("name should be \"Fluf\" and is \"" + a.getName() + "\"");
        System.out.println("breed should be \"poodle\" and is \"" + a.getBreed() + "\"");
        System.out.println("gender should be \"M\" and is \"" + a.getGender() + "\"");
    }
    
    /**
     * tests the setName() method
     */
    public static void testSetName(){
        Dog a = new Dog("Fluf", "Poodle", "M");
        a.setName("Fluffy");
        System.out.println("name should be \"Fluffy\" and is \"" + a.getName() + "\"");
    }
    
    /**
     * tests the setBreed() method
     */
    public static void testSetBreed(){
        Dog a = new Dog("Fluf", "Poodle", "M");
        a.setBreed("german shepard");
        System.out.println("breed should be \"german shepard\" and is \"" + a.getBreed() + "\"");
    }
    
    /**
     * tests the setGender() method
     */
    public static void testSetGender(){
        Dog a = new Dog("Fluf", "Poodle", "M");
        a.setGender("F");
        System.out.println("gender should be \"F\" and is \"" + a.getGender() + "\"");
    }
    
    /**
     * tests the getName() method
     */
    public static void testGetName(){
        Dog a = new Dog("Fluf", "Poodle", "M");
        System.out.println("name should be \"Fluf\" and is \"" + a.getName() + "\"");
    }
    
    /**
     * tests the getBreed() method
     */
    public static void testGetBreed(){
        Dog a = new Dog("Fluf", "Poodle", "M");
        System.out.println("breed should be \"Poodle\" and is \"" + a.getBreed() + "\"");
    }
    
    /**
     * tests the getGender() method
     */
    public static void testGetGender(){
        Dog a = new Dog("Fluf", "Poodle", "M");
        System.out.println("gender should be \"M\" and is \"" + a.getGender() + "\"");
    }
    
    /**
     * tests the getID() method
     */
    public static void testGetID(){
        Dog a = new Dog();
        Dog b = new Dog();
        
        System.out.println("ID should be a number and is " + a.getID());
        System.out.println("ID should be 1 greater than the previous and is " + b.getID());
    }
    
    /**
     * tests the toString() method
     */
    public static void testToString(){
        Dog a = new Dog("Fluf", "Poodle", "M");
        System.out.println("String should be \"FLuf, Poodle, M, a number\" and is " + a.toString() + "\"");
    }
}
