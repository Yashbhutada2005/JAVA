// input from user and check wheter number is negative or positive

package C_conditional_operator;
import java.util.*;
public class problem5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number :");
        int number = s.nextInt();

        if(number > 0) {
            System.out.println("the number is positive");
        } else {
            System.out.println("the number is negative");
        }
        s.close();

    }
    
}
