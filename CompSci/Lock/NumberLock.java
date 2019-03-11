
/**
 * A lock which unlocks with a number
 * 
 * @author Isaac Blandin
 * @version February 21, 2019
 */
public class NumberLock extends Lock
{
    private boolean isOpen = false;
    private int lockSize;
    private int digit1 = 0;
    private int digit2 = 0;
    private int digit3 = 0;
    private int digit4 = 0;
    private int digit5 = 0;
    
    private int userDig1 = 0;
    private int userDig2 = 0;
    private int userDig3 = 0;
    private int userDig4 = 0;
    private int userDig5 = 0;
    
    /**
     * Constructs a number lock with three digits
     * 
     * @param first first digit of the code
     * @param second second digit of the code
     * @param third third digit of the code
     */
    public NumberLock(int first, int second, int third){
        lockSize = 3;
        if(first >= 0 && first <= 9){
            digit1 = first;
        }
        if(second >= 0 && second <= 9){
            digit2 = second;
        }
        if(third >= 0 && third <= 9){
            digit3 = third;
        }
    }
    
    /**
     * Constructs a number lock with four digits
     * 
     * @param first first digit of the code
     * @param second second digit of the code
     * @param third third digit of the code
     * @param fourth fourth digit of the code
     */
    public NumberLock(int first, int second, int third, int fourth){
        lockSize = 3;
        if(first >= 0 && first <= 9){
            digit1 = first;
        }
        if(second >= 0 && second <= 9){
            digit2 = second;
        }
        if(third >= 0 && third <= 9){
            digit3 = third;
        }
        if(fourth >= 0 && fourth <= 9){
            digit4 = fourth;
        }
    }
    
    /**
     * Constructs a number lock with five digits
     * 
     * @param first first digit of the code
     * @param second second digit of the code
     * @param third third digit of the code
     * @param fourth fourth digit of the code
     * @param fifth fifth digit of the code
     */
    public NumberLock(int first, int second, int third, int fourth, int fifth){
        lockSize = 3;
        if(first >= 0 && first <= 9){
            digit1 = first;
        }
        if(second >= 0 && second <= 9){
            digit2 = second;
        }
        if(third >= 0 && third <= 9){
            digit3 = third;
        }
        if(fourth >= 0 && fourth <= 9){
            digit4 = fourth;
        }
        if(fifth >= 0 && fifth <= 9){
            digit5 = fifth;
        }
    }
    
    /**
     * resets lock to close, and user numbers to 0
     */
    public void reset(){
        isOpen = false;
        
        userDig1 = 0;
        userDig2 = 0;
        userDig3 = 0;
        userDig4 = 0;
        userDig5 = 0;
    }
    
    /**
     * checks to see if lock opens
     * 
     * @return boolean true if opens, false if lock does not open
     */
    public boolean open(){
        if(userDig1 == digit1 && userDig2 == digit2 && userDig3 == digit3 
        && digit4 == userDig4 && digit5 == userDig5){
            isOpen = true;
        }
        return isOpen;
    }
    
    /**
     * sets first digit
     * 
     * @param first first digit
     */
    public void setFirst(int first){
        userDig1 = first;
    }
    
    /**
     * sets second digit
     * 
     * @param second second digit
     */
    public void setSecond(int second){
        userDig2 = second;
    }
    
    /**
     * sets third digit
     * 
     * @param third third digit
     */
    public void setThird(int third){
        userDig3 = third;
    }
    
    /**
     * sets fourth digit
     * 
     * @param fourth fourth digit
     */
    public void setFourth(int fourth){
        if(lockSize >= 4){
            userDig4 = fourth;
        }
    }
    
    /**
     * sets fifth digit
     * 
     * @param fifth fifth digit
     */
    public void setFifth(int fifth){
        if(lockSize >= 5){
            userDig5 = fifth;
        }
    }
}
