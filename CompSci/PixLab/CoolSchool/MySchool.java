
/**
 * Write a description of class MySchool here.
 * 
 * @author Isaac Blandin 
 * @version march 11, 2019
 */
public class MySchool
{
    public static void main(){
        Student s1 = new Student("Emilie", "Butler");
        Teacher t1 = new Teacher("Eric", "Olson", 511, "Comp Sci");
        printFullName(s1);
        printFullName(t1);
    }
    
    public static void printFullName(Person p){
        System.out.println(p.getFirstName() + " " + p.getLastName());
    }
}
