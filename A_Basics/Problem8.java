// Sum of the Number

package A_Basics;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        while(n != 0){
            int digit = n % 10;
            sum += digit;   // add last digit to sum
            n /= 10;  // cut off last digit
        }
        System.out.println(sum);
        sc.close();
    }
}
