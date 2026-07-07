// Check if a number is prime.
 
package A_Basics;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        if(n <= 1){
            isPrime = false;
        } else {
          for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
            }
          }  
        }
        if(isPrime){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        sc.close();
        }
    }

 