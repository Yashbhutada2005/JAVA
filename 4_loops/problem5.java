// print reverse of number

package loops;
import java.util.*;
public class problem5 {
        public static void main(String[] args) {
            System.out.println("enter the number :");
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();

        while (n >  0) {
            long lastDigit = n % 10;
            System.out.print(lastDigit + "");
            n = n / 10;
        }
            sc.close();
    }    
}
