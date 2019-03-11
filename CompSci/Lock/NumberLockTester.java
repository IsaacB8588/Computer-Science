
/**
 * tests NumberLock
 * 
 * @author Isaac Blandin
 * @version February 21, 2019
 */
public class NumberLockTester
{
    public static void main(){
        testThreeDigitLock();
        //testFourDigitLock();
        //testFiveDigitLock();
    }
    
    public static void testThreeDigitLock(){
        //lock test 1 test open with all digits correct
        NumberLock lock1 = new NumberLock(7, 3, 2);
        
        lock1.setFirst(7);
        lock1.setSecond(3);
        lock1.setThird(2);
        
        System.out.println("Lock test 1 should be true, and is " + lock1.open());
        
        //lock test 2 test open with second digit incorrect
        NumberLock lock2 = new NumberLock(7, 3, 2);
        
        lock2.setFirst(7);
        lock2.setSecond(2);
        lock2.setThird(2);
        
        System.out.println("Lock test 2 should be false, and is " + lock2.open());
        
        //lock test 3 test open with reset
        lock1.reset();
        System.out.println("Lock test 3 should be false, and is " + lock1.open());
        
        //lock test 4 test open with 1st digit incorrect
        NumberLock lock3 = new NumberLock(7, 3, 2);
        
        lock3.setFirst(2);
        lock3.setSecond(3);
        lock3.setThird(2);
        
        System.out.println("Lock test 4 should be false, and is " + lock3.open());
        
        //lock test 5 test open with 3rd digit incoorect
        NumberLock lock4 = new NumberLock(7, 3, 2);
        
        lock4.setFirst(7);
        lock4.setSecond(3);
        lock4.setThird(1);
        
        System.out.println("Lock test 5 should be false, and is " + lock4.open());
        
        //lock test 6 test changing 3rd digit to fix and open
        lock4.setThird(2);
        
        System.out.println("Lock test 6 should be true, and is " + lock4.open());
        
        //locl test 7 test number out of range in digit 1 & 2
        NumberLock lock5 = new NumberLock(11, -5, 2);
        lock5.setFirst(0);
        lock5.setSecond(0);
        lock5.setThird(2);
        
        System.out.println("Lock test 7 should be true, and is " + lock5.open());
        
        //locl test 8 test number out of range in digit 3
        NumberLock lock6 = new NumberLock(9, 5, -2);
        lock6.setFirst(9);
        lock6.setSecond(5);
        lock6.setThird(0);
        
        System.out.println("Lock test 8 should be true, and is " + lock6.open());
    }
}
