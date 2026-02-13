package F_function_methods;

import java.util.*;

public class a1_AnyBaseToDecimal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        System.out.println("Enter base of the number :");
        int b = sc.nextInt();
        int ad = BaseTODecimal( n , b);
        System.out.println(ad);
        sc.close();
    }
    public static int BaseTODecimal(int n , int b){
        int ans = 0;

        int p = 1;
        while(n > 0) {
            int rem = n % 10;
            n = n / 10;
            ans += rem * p;
            p = p* b;
        }
        return ans;
    }
}
