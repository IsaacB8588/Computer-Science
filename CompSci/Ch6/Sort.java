
/**
 * Write a description of class Sort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Arrays;
public class Sort
{
    public static void main(){
        int[] numbers = {3,7,5,2,8,7,1,9,3,6};
        
        //swap adjacent pairs
        /** int swaps = 1;
        
        while(swaps != 0){
            swaps = 0;
            for(int i = 0; i < numbers.length - 1; i++){
                if(numbers[i] > numbers[i + 1]){
                    swap(numbers, i, i + 1);
                    swaps++;
                }
            }
        }
        */
       
        //swap every following pair that is smaller
        
        for(int i = 0; i < numbers.length; i++){
            for(int n = i + 1; n < numbers.length; n++){
                if (numbers[i] > numbers[n]){
                    swap(numbers, i, n);
                    System.out.println(Arrays.toString(numbers));
                }
            }
        }
    }
   
    public static void swap(int[] array, int pos1, int pos2){
        int hold = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = hold;
    }
}
