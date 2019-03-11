
/**
 * Creates an array of ten random integers and prints\
 * every element at an even index, even elements, elements in reverse, and first and last
 * 
 * @author Isaac Blandin
 * @version December 12, 2018
 */
public class P1
{
    public static void main() {
        int[] num = new int[10];
        //fill with random numbers up from 0 to 49
        for(int i = 0; i < num.length; i++){
            num[i] = (int)(Math.random() * 50);
        }
        //print elements at even index
        for(int i = 0; i < num.length; i += 2){
            System.out.print(num[i] + " ");
        }
        System.out.print("\n");
        //print even elements
        for(int i = 0; i < num.length; i ++){
            if(num[i] % 2 == 0){
                System.out.print(num[i] + " ");
            }
        }
        System.out.print("\n");
        //print in reverse order
        for(int i = num.length - 1; i >= 0; i --){
            System.out.print(num[i] + " ");
        }
        System.out.print("\n");
        //print first and last characters
        System.out.print(num[0] + " ");
        System.out.print(num[num.length - 1] + " ");
        System.out.print("\n");
    }
}
