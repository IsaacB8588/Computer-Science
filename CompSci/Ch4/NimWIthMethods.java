
/**
 * Nim Game using methods
 * 
 * @author Isaac Blandin 
 * @version November 2, 2018
 */
import java.util.Scanner;
public class NimWIthMethods
{
    public static void main(){
        int pennies = setPennies();
        
        boolean smart = setSmart();
        
        boolean userTurn = setTurn();
        
        gameIntro(pennies, userTurn);
        
        while(pennies > 1){
            if(userTurn){
                pennies = userPlay(pennies);
            } else {
                if(smart){
                    pennies = CpuSmartPlay(pennies);
                } else {
                    pennies = randomChoice(pennies);
                }
            }
            userTurn = !userTurn;
            currentPennies(pennies);
        }
        
        declareWinner(userTurn);

    }
    
    public static int setPennies(){
        int pennies = 0;
        //create random amount of pennies
        while (pennies < 50 || pennies > 200){
            pennies = (int)(Math.random() * 201);
        }
        
        return pennies;
    }
    
    public static boolean setSmart(){
        //chooses whether the computer is smart or dumb
        boolean smart = false;
        if(Math.random() >= 0.5){
            smart = true;
        }
        return smart;
    }
    
    public static boolean setTurn(){
        //chooses whether the user or the computer play first
        boolean userTurn = false;
        if(Math.random() >= 0.5){
            userTurn = true;
        }
        return userTurn;
    }
    
    public static void gameIntro(int pennies, boolean userTurn){
        System.out.println("Welcome to Nim");
        System.out.println("There are " + pennies + " pennies on the table");
        if(userTurn){
            System.out.println("You go first");
        } else {
            System.out.println("I'll go first");
        }
    }
    
    public static int userPlay(int pennies){
        Scanner in = new Scanner(System.in);
        //request an input from the user but repeat if an invalid input
        int take = 0;
        while(take < 1 || take > pennies / 2){
             System.out.print("how many pennies do you want: ");
             if(in.hasNextInt()){
                 take = in.nextInt();
             }
                    
                }
        pennies -= take;
        return pennies;
    }
    
    public static int CpuSmartPlay (int pennies){
        int n = 1;
        while (pennies >= (int)Math.pow(2, n) - 1){
             n ++;
        }
        n--;
        if(pennies != (int)Math.pow(2, n) - 1){
             System.out.println("I take " + (int)(pennies - (Math.pow(2, n) - 1)) + " pennies");
             pennies -= pennies - ((int)Math.pow(2, n) - 1);
        } else {
             pennies = randomChoice(pennies);           
        }
        return pennies;
    }
    
    public static int randomChoice (int pennies){
        int take = (int) (Math.random() * (pennies/2) + 1);
        System.out.println("I take " + take + " pennies");
        pennies -= take;
        return pennies;
    }
    
    public static void currentPennies (int pennies){
        System.out.println("There are " + pennies + " pennies on the table");
    }
    
    public static void declareWinner (boolean userTurn){
        if(userTurn){
            System.out.println("You Lose");
        } else {
            System.out.println("You Win");
        }
    }
}
