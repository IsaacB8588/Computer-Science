
/**
 * Boolean method that returns if a given year is a leap year or not.  
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P20
{
    public static void main(){
        
    }
    
    public static boolean isLeapYear (int year) {
        if(year % 400 == 0){
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
