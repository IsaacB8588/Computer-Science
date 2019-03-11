
/**
 * A type of lock which opens with a combination
 * 
 * @author Isaac Blandin
 * @version February 25, 2019
 */
public class PadLock extends Lock
{
    private boolean isOpen = false;
    
    private int dig1 = 0;
    private int dig2 = 0;
    private int dig3 = 0;
    
    private boolean valid = true;
    private boolean firstTurn = true;
    private boolean lastRight = false;
    private boolean lastLeft = false;
    private int turns = 0;
    
    private int spinnerPos = 0;
    
    private int user1 = 0;
    private int user2 = 0;
    private int user3 = 0;
    
    /**
     * Constructs a padlock
     * 
     * @param first first digit
     * @param second second digit
     * @param third third digit
     */
    public PadLock(int first, int second, int third){
        dig1 = first;
        dig2 = second;
        dig3 = third;
    }
    
    /**
     * resets the locks values
     */
    public void reset(){
        valid = true;
        firstTurn = true;
        lastRight = false;
        lastLeft = false;
        turns = 0;
        spinnerPos = 0;
        isOpen = false;
        
        user1 = 0;
        user2 = 0;
        user3 = 0;
    }
    
    /**
     * checks if the lock will open
     */
    public boolean open(){
        if(user1 == dig1 && user2 == dig2 && user3 == dig3 && turns == 3 && valid){
            isOpen = true;
        }
        return isOpen;
    }
    
    /**
     * turns the spinner to the right
     * 
     * @param ticks number of the notches it turns
     */
    public void turnRight(int ticks){
        if(lastRight || (firstTurn && ticks < 80)){
            valid = false;
        }
        if(firstTurn || (lastLeft && turns == 2) && valid){
            for(int i = 0; i < ticks; i++){
                spinnerPos--;
                if(spinnerPos == -1){
                    spinnerPos = 39;
                }
            }
            if(firstTurn){
                user1 = spinnerPos;
            } else {
                user3 = spinnerPos;
            }
            firstTurn = false;
        }
        lastRight = true;
        lastLeft = false;
        turns++;
    }
    
    /**
     * turns the lock to the left
     * 
     * @param ticks number of notches to turn
     */
    public void turnLeft(int ticks){
        if(firstTurn || lastLeft || turns != 1){
            valid = false;
        }
        if(lastRight && turns == 1 && valid){
            for(int i = 0; i < ticks; i++){
                spinnerPos++;
                if(spinnerPos == 40){
                    spinnerPos = 0;
                }
            }
            user2 = spinnerPos;
        }
        lastRight = false;
        lastLeft = true;
        turns++;
    }
    
    /**
     * gets the position of the spinner for testing
     * 
     * @return int - position of the spinner
     */
    public int position(){
        return spinnerPos;
    }
}
