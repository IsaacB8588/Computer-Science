
/**
 * Uses DialogViewer
 * 
 * @author Isaac 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;

public class P15_P16
{
   public static void main(){
       String name = JOptionPane.showInputDialog("What is your name?");
       System.out.print("Hello, "+ name + "!");
       JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
       System.out.println("I'm sorry, " + name + ", but I can't do that.");
    
    }
}
