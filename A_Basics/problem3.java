// Check if a number is a palindrome (e.g., 121).

package A_Basics;

import java.util.Scanner;

public class problem3 {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int original = n;
    int reversed = 0;

    while(n != 0){
        int digit = n % 10;    // last digit 
        reversed = reversed * 10 + digit;   // add new number at last 
        n /= 10;  // cut off last digit
    }
    
    if(original == reversed){
        System.out.println("Palindrome");
    }else{
        System.out.println("Not a Palindrome");
    }
    sc.close();
}
}
