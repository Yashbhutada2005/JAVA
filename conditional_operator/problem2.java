// print the number is even or odd

package conditional_operator;
import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        System.out.println("enter number :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("the number is even");

        } else {
            System.out.println("the number is odd");
        }
    }
    
}
