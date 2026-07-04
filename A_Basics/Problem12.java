// All Prime number Betn 1 to N

package A_Basics;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 2; i <= n; i++){
            boolean isPrime = true;

            for(int j = 2; j <= i; j++){
                if(i % j == 0 && i != j){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(  i + " " );
            }
        }
        sc.close();
    }    
}
