// Km to Miles

package practice_set_1;
import java.util.*;
public class problem3 {
    public static void main(String[] args) {

        float km ;
        System.out.println("Enter Km :");
        Scanner sc = new Scanner(System.in);
        float Km = sc.nextFloat();

        float miles = (Km  * 0.62137f);
        System.out.println("miles " + miles);
        
    }
}
