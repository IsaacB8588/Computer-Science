
/**
 * adds the correct article for French Countries depending on plural, masculine or feminine, etc. 
 * 
 * @author Isaac Blandin 
 * @version September 19, 2018
 */
import java.util.Scanner;
public class P29
{
    public static void  main(){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Country Name: ");
        String name = in.next();
        int length = name.length();
        String first = name.substring(0,1);
        String last = name.substring(name.length()-1);
        //les if plural
        if (name.equals("Etats-Unis") || name.equals("Pays-Bas")){
            System.out.println("les " + name);
        }
        //masculine exceptions
        else if (name.equals("Belize") || name.equals("Cambodge") || name.equals("Mexique") || name.equals("Mozambique") || name.equals("Zaire") || name.equals("Zimbabwe")){
            System.out.println("le " + name);
        } 
        // l' if starts with vowel
        else if (first.equals("A") || first.equals("E") || first.equals("I") || first.equals("O") || first.equals("U")){
            System.out.println("l' " + name);
        } 
        // la if feminine
        else if (last.equals("e")){
            System.out.println("la " + name);
        }
        //le if masculine
        else {
            System.out.println("le " + name);
        }
    }
}
