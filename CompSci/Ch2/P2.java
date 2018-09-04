
/**
 * Computes and displays the perimeter and diagonal of a letter-sized piece of paper
 * 
 * @author Isaac
 * @version August 29, 2018
 */
public class P2
{
   public static void main(){
       final double PAPER_WIDTH = 8.5; //letter sized paper width in inches
       final double PAPER_LENGTH = 11; // letter sized paper lenght in inches
       
       double perimeter = PAPER_WIDTH*2 + PAPER_LENGTH*2;
       double diagonal = Math.sqrt(Math.pow(PAPER_WIDTH,2)+Math.pow(PAPER_LENGTH, 2));
       
       System.out.printf("Perimeter: %.1f inches Diagonal: %.2f inches", perimeter, diagonal);
    }
}
