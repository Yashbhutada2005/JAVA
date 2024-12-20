// print number upto n , input from user 

package loops;
import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        System.out.println("enter n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 1;
        while(number <= n) {
            System.out.println(number);
            number++ ;

        }
        sc.close();
    }
    
}
