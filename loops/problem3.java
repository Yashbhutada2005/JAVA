// sum of first n natural number

package loops;
import java.util.*;
public class problem3 {
    public static void main(String[] args) {
        System.out.println("enter n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        
        while(i <= n) {
             sum += i ;
             i++;
            
        }
        System.out.println("sum is " + sum);
    }
    
}
