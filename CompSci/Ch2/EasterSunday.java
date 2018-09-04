
/**
 * Gives the month and day of Easter in a given year
 * 
 * @author Isaac & Cameron
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class EasterSunday
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
  
        // asks for year
        System.out.println();
        System.out.print("Year: " );
        int y = in.nextInt();
        
        //computes day ond month where Easter falls
        int a = y%19;
        int b = y/100;
        int c = y%100;
        int d = b/4;
        int e = b%4;
        int g = (8*b+13)/25;
        int h = (19*a+b-d-g+15)%30;
        int j = c/4;
        int k = c%4;
        int m = (a+11*h)/319;
        int r = (2*e+2*j-k-h+m+32)%7;
        
        int n = (h-m+r+90)/25; // number of month of the year
        int p = (h-m+r+n+19)%32; // day in the month
  
        //prints day and month of Easter
        System.out.println("Day: " + p + " Month: " + n);
    }
}
