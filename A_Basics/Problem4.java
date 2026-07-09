// Check if a number is an Armstrong number (e.g., 153).

//👉 An Armstrong number is a number that is equal to the sum of its digits 
// raised to the power of the number of digits.
// ex : 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.

package A_Basics;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int result = 0;
        int digits = String.valueOf(n).length();

        while(n != 0){
            int digit = n % 10;    // last digit
            result += Math.pow(digit , digits);   // add digit ^ digits
            n /= 10;  // cut off last digit 
        }

        if(result == original){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
        sc.close();
    }
}



