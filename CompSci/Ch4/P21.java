
/**
 * Takes a given integer and prints a diamond with the given side length with asterisks
 * 
 * @author Isaac Blandin
 * @version October 25, 2018
 */
import java.util.Scanner;
public class P21
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        boolean valid = false;
        int length = 0;
        int asts = 1;
        int spaces = 0;
        
        while(!valid){
            System.out.print("Enter Side Length: ");
            if(in.hasNextInt()){
                length = in.nextInt();
                valid = true;
            }
        }
        spaces = length - 1;
        for(int i = 0; i < length; i ++){
            for(int n = 0; n < spaces; n ++){
                System.out.print(" ");
            }
            for(int n = 0; n < asts; n++){
                System.out.print("*");
            }
            for(int n = 0; n < spaces; n ++){
                System.out.print(" ");
            }
            asts += 2;
            spaces --;
            System.out.println();
        }
        asts -= 4;
        spaces += 2;
        for(int i = 0; i < length - 1; i ++){
            
            for(int n = 0; n < spaces; n ++){
                System.out.print(" ");
            }
            for(int n = 0; n < asts; n++){
                System.out.print("*");
            }
            for(int n = 0; n < spaces; n ++){
                System.out.print(" ");
            }
            asts -= 2;
            spaces ++;
            System.out.println();
        }
    }
}
