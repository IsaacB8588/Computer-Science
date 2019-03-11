
/**
 * Prints a Postal barcode
 * 
 * @author Isaac Blandin
 * @version (November 30, 2018
 */
public class P25
{
    public static void main(){
        printBarCode(52742);
        System.out.println();
    }
    
    public static void printDigit(int d){
        //check if it is one of the weights
        boolean isWeight = d == 7 || d == 4 || d == 2 || d == 1;
        if(d == 0){
            d = 11;
        }
        //reduce out the weights
        d = reducer(d, 7);
        d = reducer(d, 4);
        d = reducer(d, 2);
        d = reducer(d, 1);
        //adds zero weight if is a weight at the beginning
        if(isWeight){
            System.out.print("|");
        } else {
            System.out.print(":");
        }
    }
    
    public static void printBarCode(int zipCode){
        //beginning bar
        System.out.print("|");
        //print for each digit
        for(int i = 4; i >= 0; i--){
            int digit = (zipCode / (int)Math.pow(10, i) ) % 10;
            printDigit(digit);
        }
        //ending bar
        System.out.print("|");
    }
    
    public static int reducer (int num, int reduction){
        //take out weight if able to and add bar
        if(num >= reduction){
            num -= reduction;
            System.out.print("|");
        } else {
            System.out.print(":");
        }
        return num;
    }
}
