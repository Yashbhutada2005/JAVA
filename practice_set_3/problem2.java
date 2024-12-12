// multiplication table of n

package practice_set_3;
import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        
        System.out.print("Enter number = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n ; i++) {
            for(int j = 1; j <= 10; j++) {
            int mul = n*j;
            
            System.out.println(mul);
        }
    }
    }
    
}
