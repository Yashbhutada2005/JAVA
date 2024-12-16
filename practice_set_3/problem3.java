// print a table in reverse order 

package practice_set_3;
import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        
        System.out.print("Enter n =");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 10 ; i >= 1; i--) {
            
            System.out.println(n*i);
        }
        sc.close();
        }
    }

