
/**
 * The Game of Nim
 * 
 * @author Isaac Blandin
 * @version October 25, 2018
 */
import java.util.Scanner;
public class P22
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        //creates a random number of pennies from 50 to 200;
        int pennies = 0;
        while (pennies < 10 || pennies > 100){
            pennies = (int)(Math.random() * 101);
        }
    
        //chooses whether the computer is smart or dumb
        boolean smart = false;
        if(Math.random() >= 0.5){
            smart = true;
        }
        
        //chooses whether the user or the computer play first
        boolean userTurn = false;
        if(Math.random() >= 0.5){
            userTurn = true;
        }
        
        System.out.println("Welcome to Nim");
        System.out.println("There are " + pennies + " pennies on the table");
        if(userTurn){
            System.out.println("You go first");
        } else {
            System.out.println("I'll go first");
        }
        
        while(pennies > 1){
            if(userTurn){
                //request an input from the user but repeat if an invalid input
                int take = 0;
                while(take < 1 || take > pennies / 2){
                    System.out.print("how many pennies do you want: ");
                    if(in.hasNextInt()){
                        take = in.nextInt();
                    }
                    
                }
                pennies -= take;
            } else {
                if (smart){
                    int n = 1;
                    while (pennies >= (int)Math.pow(2, n) - 1){
                        n ++;
                    }
                    n--;
                    if(pennies != (int)Math.pow(2, n) - 1){
                        System.out.println("I take " + (int)(pennies - (Math.pow(2, n) - 1)) + " pennies");
                        pennies -= pennies - ((int)Math.pow(2, n) - 1);
                    } else {
                        int take = (int) (Math.random() * (pennies/2) + 1);
                        System.out.println("I take " + take + " pennies");
                        pennies -= take;
                        
                    }
                } else {
                    int take = (int) (Math.random() * (pennies/2) + 1);
                        System.out.println("I take " + take + " pennies");
                        pennies -= take;
                }
            }
            System.out.println("There are " + pennies + " pennies on the table");
            userTurn = !userTurn;
        }
        if(userTurn){
            System.out.println("You Lose");
        } else {
            System.out.println("You Win");
        }
    }
}
