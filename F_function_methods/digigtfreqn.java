package F_function_methods;

import java.util.*;

public class digigtfreqn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        long n = sc.nextLong();
        System.out.println("Enter the Digit to Check :");
        Long d = sc.nextLong();
        long f = getFrequency(n, d);
        System.out.println("The number of time " + d + " occur in " + n + " is "+f);
        sc.close();

    }
    
    public static long getFrequency(long n ,long d){

        int cnt = 0;

        while(n > 0){
            long rem = n % 10;     // extract the digit 
            if(rem == d){
            cnt++;
        }
        n = n / 10;              // remove the digit
    }

    return cnt;
    
}
}
