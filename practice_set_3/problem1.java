// sum first n even number 

package practice_set_3;
import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        
        System.out.println("Enter number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = n * (n+1) / 2;

        for(int i = 1; i <= n ; i++) {
            sum = sum + i;
        }
        
            System.out.println(sum);
            sc.close();
        }
        
    }

