
/**
 * Gives the demensions of a latter piece of paper in millimeters 
 * 
 * @author Isaac Blandin
 * @version August 29, 2018
 */
public class P1
{
    public static void main() {
        final double INCHES_WIDTH = 8.5; // width of a piece of letter-size paper
        final double INCHES_LENGTH = 11; // length of a piece of letter-size paper
        final double MM_IN_INCH = 25.4; // number of millimeters in an inch
        
        double mmWidth = INCHES_WIDTH*MM_IN_INCH; //convert width to millimeters
        double mmLength = INCHES_LENGTH*MM_IN_INCH; // convert length to millimeters
        
        System.out.print("a piece of letter sized paper is ");
        System.out.printf("%.2f", mmWidth);
        System.out.print(" x ");
        System.out.printf("%.2f", mmLength);
        System.out.print(" millimeters");
        System.out.println();
    }
}
