// find factorial of n number

package practice_set_3;
import java.util.*;

import function_methods.factorial;
public class problem4 {
    public static void main(String[] args) {
        
        System.out.println("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double factorial = 1;

        for(int i = 1; i <= n ; i++) {
            factorial *= i ;
            
        }
        System.out.println("The factorial of " + n + " is " + factorial);
    }
}
