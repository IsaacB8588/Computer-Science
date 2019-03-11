
/**
 * Tests the PadLock Object
 * 
 * @author Isaac Blandin
 * @version February 25, 2019
 */
public class PadLockTester
{
    public static void main(){
    
    }
    
    public static void testPadLock(){
        PadLock a = new PadLock (3, 28, 12);
        
        //tests padlock when opening correctly
        a.turnRight(117);
        a.turnLeft(65);
        a.turnRight(16);
        
        System.out.println("Open with correct code should be true and is : " + a.open());
        
        //tests padlock when opening correctly with extra first turn
        a.turnRight(157);
        a.turnLeft(65);
        a.turnRight(16);
        
        System.out.println("Open with correct code should be true and is : " + a.open());
        
        //tests padlock with reset
        a.reset();
        System.out.println("Open after reset should be false and is : " + a.open());
        
        //tests padlock with wrong second number
        a.turnRight(117);
        a.turnLeft(67);
        a.turnRight(16);
        
        System.out.println("Open with incorrect code should be false and is: " + a.open());
        
        //tests padlock with correct code but not right-left-right
        a.reset();
        a.turnRight(117);
        a.turnRight(15);
        a.turnRight(16);
        
        System.out.println("Open without right-left-right should be false and is: " + a.open());
    }
}
