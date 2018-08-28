
/**
 * Write a description of class DialogViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;

public class DialogViewer
{
   public static void main(){
       String name = JOptionPane.showInputDialog("What is your name?");
       System.out.print("Hello, ");
       System.out.print(name);
       System.out.println("!");
       JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
       System.out.print("I'm sorry, ");
       System.out.print(name);
       System.out.println(", but I can't do that.");
    
    }
}
