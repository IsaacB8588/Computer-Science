
/**
 * Gives the season depedning on month and day
 * 
 * @author Isaac Blandin
 * @version September 18, 2018
 */
import java.util.Scanner;
public class P18
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        int month = 0;
        int day = 0; 
        int season;
        String seasonName;
        //ask user for month
        System.out.print("Enter month as number: ");
        //check if entry is an int
        if (in.hasNextInt()){
            month = in.nextInt();
            
            //check if month is within acceptable range
            if (month > 0 && month < 13){
                if (month == 1 || month == 2 || month == 3){
                    season = 1; //winter 
                } 
                else if (month == 4 || month == 5 || month == 6){
                    season = 2; // spring
                }
                else if (month == 7 || month == 8 || month == 9){
                    season = 3; // summer
                } else {
                    season = 4; // fall
                }
                //ask for month
                System.out.print("Enter day of month: ");
                //check if input is valid
                if(in.hasNextInt()){
                    day = in.nextInt();
                    //go up a season if month is divisible by 3 and day is at least 21
                    if (month % 3 == 0 && day >= 21){
                        if (season < 4){
                            season ++;
                        } else {
                            season = 1;
                        }
                    }
                } else {
                    System.out.println("Not an Integer");
                }
                
                if(season == 1){
                    seasonName = "Winter";
                } else if (season == 2){
                    seasonName = "Spring";
                } else if (season == 3){
                    seasonName = "Summer";
                } else {
                    seasonName = "Fall";
                }
                
                System.out.println("The Season is " + seasonName);
            }else {
                System.out.println("Not a valid number");
            }
        } else {
            System.out.println("Not an Integer");
        }
    }
}
