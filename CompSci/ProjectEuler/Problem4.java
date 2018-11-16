
/**
 * Finds the largest palindrome product of 2 3-digit factors.  
 * 
 * @author Isaac Blandin
 * @version October 8, 2018
 */
public class Problem4
{
    public static void main(){
        int factOne = 999;
        int factTwo = 999;
        int num = 1;
        int digits;
        int largest = 0;
         
        while(num != 0){
    
            //create the product
            num = factOne * factTwo;
            //find the length of the product
            digits = String.valueOf(num).length();
            
            //check if first and last digits are the same
            if( num % 10 == num / (int) Math.pow(10, digits - 1)){
                if(digits > 3){
                    //if there is 4 or 5 digits, check the second and second to last digit
                    if(num % 100 / 10 == num / (int) Math.pow(10, digits - 2) - (num / (int) Math.pow(10, digits - 1) * 10)){
                        if(digits > 5){
                            //if there is 6 or 7 digits, check the third and third to last digit
                            if (num % 1000 / 100  == num / (int) Math.pow(10, digits - 3) - (num / (int) Math.pow(10, digits - 2) * 10)){
                                //store new largest palindrome if it is greater than the last
                                if(num > largest){
                                    largest = num;
                                }
                            }
                        } else {
                            //store new largest palindrome if it is greater than the last
                            if (num > largest){
                                largest = num;
                            }
                        }
                    }
                } else {
                    //store new largest palindrome if it is greater than the last
                    if(num > largest){
                        largest = num;
                    }
                }
            }
            //reduce the second factor by one until it becomes a two digit number and reset it and reduce the 
            //first if needed.
            if(factTwo <= 100){
                
                factOne --;
                factTwo = 999;
            } else {
                factTwo --;
            }
        }
        
        //print the output to the user.
        System.out.println("Largest is " + largest);
    }
}
