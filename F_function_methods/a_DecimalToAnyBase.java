package F_function_methods;

import java.util.*;

public class a_DecimalToAnyBase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        long n = sc.nextLong();
        System.out.println("Enter the base to convert : ");
        long b = sc.nextLong();
        long dn = DecimalToBase(n, b);
        System.out.println(dn);
        sc.close();
    }

    public static long DecimalToBase(long n, long b){
        long ans = 0;

        long p = 1;                // value like (1 , 10 , 100)
        while(n > 0){
            long rem = n % b;      // remainder = digit in base b
            n = n / b;             // reduce number
            ans += rem * p;        // build the answer 
            p *= 10;               // shift place
        }
        return ans;
    }
}
