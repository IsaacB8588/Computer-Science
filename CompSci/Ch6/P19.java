                                  
/**
 * Creates a magic square at a given size
 * 
 * @author Isaac Blandin
 * @version March 9, 2019
 */
import java.util.Arrays;
import java.util.Scanner;
public class P19
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = in.nextInt();
        int[][] sqr = new int[n][n];
        
        int row = n - 1;
        int col = n/2;
        
        int lastRow = row;
        int lastCol = col;
        for(int k = 1; k <= n*n; k ++){
            sqr[row][col] = k;
            lastRow = row;
            row++;
            lastCol = col;
            col++;
            if(row == n){
                row = 0;
            }
            if(col == n){
                col = 0;
            }
            if(sqr[row][col] != 0){
                row = lastRow;
                col = lastCol;
                row--;
            }
        }
        for(int i = 0; i < sqr.length; i++){
            System.out.println(Arrays.toString(sqr[i]));
        }
        
    }
}
