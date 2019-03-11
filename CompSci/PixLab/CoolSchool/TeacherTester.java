
/**
 * Tests the teacher object
 * 
 * @author Isaac Blandin
 * @version February 18, 2019
 */
public class TeacherTester
{
    public static void main(){
        testToString();
    }
    
    /**
     * tests the toString method
     */
    public static void testToString(){
        Teacher teacher1 = new Teacher("Eric", "Olson", 155, "Comp Sci");
        System.out.println(teacher1.toString());
    }
}
