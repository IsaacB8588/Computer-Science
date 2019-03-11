
/**
 * tests the principal object
 * 
 * @author Isaac Blandin
 * @version February 18, 2019
 */
public class PrincipalTester
{
    public static void main(){
        //testToString;
        //testGetTitle;
        //testSetTitle;
        //testGetBuilding;
        //testSetBuilding;
        
    }
    
    /**
     * tests the toString method
     */
    public static void testToString(){
        Principal a = new Principal("Bob", "Jones", "Head Principal", "High School");
        System.out.println("String should be \"Bob Jones, 1, Title: Head Principal, Building: High School\" and is \"" + a.toString() + "\"");
    }
    
    /**
     * tests the getTitle method
     */
    public static void testGetTitle(){
        Principal a = new Principal("Bob", "Jones", "Head Principal", "High School");
        System.out.println("Title should be \"Head Principal\" and is \"" + a.getTitle() + "\"");
    }
    
    /**
     * tests the setTitle method
     */
    public static void testSetTitle(){
        Principal a = new Principal("Bob", "Jones", "Head Principal", "High School");
        a.setTitle("Dean");
        System.out.println("Title should be \"Dean\" and is \"" + a.getTitle() + "\"");
    }
    
    /**
     * tests the getBuilding method
     */
    public static void testGetBuilding(){
        Principal a = new Principal("Bob", "Jones", "Head Principal", "High School");
        System.out.println("Buidling should be \"High School\" and is \"" + a.getBuilding() + "\"");
    }
    
    /**
     * test the setBuidling method
     */
    public static void testSetBuidling(){
        Principal a = new Principal("Bob", "Jones", "Head Principal", "High School");
        a.setBuilding("Elementary");
        System.out.println("Title should be \"Elementary\" and is \"" + a.getBuilding() + "\"");
    }
}
