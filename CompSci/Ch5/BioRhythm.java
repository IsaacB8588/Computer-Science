
/**
 * Gives a person their biorhythm data
 * 
 * @author Isaac Blandin
 * @version November 12, 2018
 */
import java.util.Scanner;
public class BioRhythm
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Today's");
        System.out.print("Day: ");
        int day = in.nextInt();
        System.out.print("Month: ");
        int month = in.nextInt();
        System.out.print("Year: ");
        int year = in.nextInt();
        System.out.println("Enter Birth");
        System.out.print("Day: ");
        int dayBirth = in.nextInt();
        System.out.print("Month: ");
        int monthBirth = in.nextInt();
        System.out.print("Year: ");
        int yearBirth = in.nextInt();
        
        BioRhythmData(day, month, year, dayBirth, monthBirth, yearBirth);
        
        
        
    }
    
    public static int calcDays(int day, int month, int year){
        int daysOld = 0;
        
        //calculate days in year up to the current year
        daysOld += (year - 1) * 365;
        daysOld += (year - 1) / 4;
        daysOld -= (year - 1) / 100;
        daysOld += (year - 1) / 400;
        
        //calculate days in the months up to the current month
        for (int i = 1; i < month; i ++){
            if(i == 2){
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    daysOld += 29;
                } else {
                    daysOld += 28;
                }
            } 
            else if (i % 2 == 0){
                if (i < 8){
                    daysOld += 30;
                } else {
                    daysOld += 31;
                }
            } else {
                if(i < 8){
                    daysOld += 31;
                } else {
                    daysOld += 30;
                }
            }
        }
        
        //add days of the current month
        daysOld += day;
        
        return daysOld;
    }
    
    public static void BioRhythmData (int day, int month, int year, int birthDay, int birthMonth, int birthYear){
        int daysOld = calcDays(day, month, year) - calcDays(birthDay, birthMonth, birthYear);
        
        System.out.println("Days Old: " + daysOld);
        System.out.println("Physical: " + getPhysical(daysOld));
        System.out.println("Emotional: " + getEmotional(daysOld));
        System.out.println("Intellectual: " + getIntellectual(daysOld));
    }
    
    public static int getPhysical(int days){
        double physical = 100 * Math.sin(2 * Math.PI / 23 * days);
        return (int)physical;
    }
    
    public static int getEmotional(int days){
        double emotional = 100 * Math.sin(2 * Math.PI / 28 * days);
        return (int)emotional;
    }
    
    public static int getIntellectual(int days){
        double intellectual = 100 * Math.sin(2 * Math.PI / 33 * days);
        return (int)intellectual;
    }
}
