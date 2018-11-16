
/**
 * Takes a number between 1 and 3999 and gives it back in roman numeral
 * 
 * @author Isaac Blandin
 * @version September 19, 2018
 */
import java.util.Scanner;
public class P26
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        int num = 0;
        String thousandsString = "";
        String hundredsString = "";
        String tensString = "";
        String onesString = "";
        
        System.out.print("Ente Positive Integer under 4000: ");
        if(in.hasNextInt()){
            num = in.nextInt();
            if(num > 0 && num < 4000){
                
                //isolate the digits for each level
                int thousands = num / 1000;
                num = num % 1000;
                int hundreds = num / 100;
                num = num % 100;
                int tens = num / 10;
                num = num % 10;
                int ones = num;
                
                //find numerals for thousands
                if(thousands == 1){
                    thousandsString = "M";
                } else if (thousands == 2){
                    thousandsString = "MM";
                } else if (thousands == 3){
                    thousandsString = "MMM";
                }
                //find numerals for hundreds
                if(hundreds == 1){
                    hundredsString = "C";
                } else if (hundreds == 2){
                    hundredsString = "CC";
                } else if (hundreds == 3){
                    hundredsString = "CCC";
                } else if (hundreds == 4){
                    hundredsString = "CD";
                } else if (hundreds == 5){
                    hundredsString = "D";
                } else if (hundreds == 6){
                    hundredsString = "DC";
                } else if (hundreds == 6){
                    hundredsString = "DCC";
                } else if (hundreds == 8){
                    hundredsString = "DCCC";
                } else if (hundreds == 9){
                    hundredsString = "CM";
                }
                //find numeral for tens
                if(tens == 1){
                    tensString = "X";
                } else if (tens == 2){
                    tensString = "XX";
                } else if (tens == 3){
                    tensString = "XXX";
                } else if (tens == 4){
                    tensString = "XL";
                } else if (tens == 5){
                    tensString = "L";
                } else if (tens == 6){
                    tensString = "LX";
                } else if (tens == 7){
                    tensString = "LXX";
                } else if (tens == 8){
                    tensString = "LXXX";
                } else if (tens == 9){
                    tensString = "XC";
                } 
                //find numerals for ones
                if(ones == 1){
                    onesString = "I";
                } else if (ones == 2){
                    onesString = "II";
                } else if (ones == 3){
                    onesString = "III";
                } else if (ones == 4){
                    onesString = "IV";
                } else if (ones == 5){
                    onesString = "V";
                } else if (ones == 6){
                    onesString = "VI";
                } else if (ones == 7){
                    onesString = "VII";
                } else if (ones == 8){
                    onesString = "VIII";
                } else if (ones == 9){
                    onesString = "IX";
                } 
                
                //print roman numeral
                System.out.println("The numeral is " + thousandsString + hundredsString + tensString + onesString);
                
            } else {
                System.out.println("Not a valid number");
            }
        } else {
            System.out.println("Entry not an Integer");
        }
    }
}
