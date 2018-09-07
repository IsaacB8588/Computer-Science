
/**
 * Asks for a radius from user and gives the circumfrence and area for a circle with that raidus.
 * Also gives volume and surface area of sphere with that radius
 * 
 * @author Isaac Blandin 
 * @version September 5, 2018
 */
import java.util.Scanner;
import java.lang.Math;
public class P7
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        //ask user for radius
        System.out.print("radius: ");
        double radius = in.nextDouble();
        
        //calculate circle circumfrence
        double circumfrence = radius*2*Math.PI ;
        //calculate circle are
        double area = Math.pow(radius,2)*Math.PI;
        
        //calculate sphere volume
        double volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);
        //calculate surface area
        double surfaceArea = 4*Math.PI*Math.pow(radius,2);
        
        //print values (rounded to two decimal values)
        System.out.println("*values are rounded to 2 decimal values*");
        System.out.printf("Circle Circumfrence: %.2f", circumfrence);
        System.out.println();
        System.out.printf("Circle Area: %.2f", area);
        System.out.println();
        System.out.printf("Sphere Volume: %.2f", volume);
        System.out.println();
        System.out.printf("Sphere Surface Area: %.2f", surfaceArea);
    }
}
