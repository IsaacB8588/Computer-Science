
/**
 * checks if values create a magic square;
 * 
 * @author Isaac Blandin
 * @version January 15
 */
import java.util.Scanner;
import java.util.Arrays;
public class P18
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        int[][] square = new int[4][4];
        boolean valid = false;
        boolean allNums = true;
        boolean same = true;
        
        
        for(int row = 0; row < square.length; row++){
           for(int col = 0; col < square[0].length; col++){
                    
               System.out.print("Enter Value: ");
               square[row][col] = in.nextInt();
                    
           }
        }
            
        System.out.println(Arrays.toString(square[0]));
        System.out.println(Arrays.toString(square[1]));
        System.out.println(Arrays.toString(square[2]));
        System.out.println(Arrays.toString(square[3]));
        
        for(int i = 1; i <= 16; i++){
           if(!search(square, i)){
              allNums = false;
           }
        }
        
        int last = sumRow(square[0]);
        for(int i = 1; i < square[0].length; i++){
            if(sumRow(square[i]) != last){
                same = false;
            }
        }
        for(int i = 1; i < square.length; i++){
            if(sumCol(square, i) != last){
                same = false;
            }
        }
        if(sumDiagUp(square) != last){
            same = false;
        }
        if(sumDiagDown(square) != last){
            same = false;
        }
        
        if(same && allNums){
            System.out.println("square is magic");
        } else {
            System.out.println("square is not magic");
        }
       
        
        
    }
    
    public static boolean search(int[][] array, int term){
        boolean found = false;
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[0].length; col++){
                if (array[row][col] == term){
                    found = true;
                }
            }
        }
        return found;
    }
    
    public static int sumRow(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
           sum += array[i]; 
        }
        return sum;
    }
    
    public static int sumCol(int[][] array, int col){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
           sum += array[i][col]; 
        }
        return sum;
    }
    
    public static int sumDiagDown(int[][] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
           sum += array[i][i]; 
        }
        return sum;
    }
    public static int sumDiagUp(int[][] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
           sum += array[i][array.length - 1 - i]; 
        }
        return sum;
    }
}
