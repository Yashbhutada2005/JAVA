// SUM OF N NATURAL NUMBER

package K_Recursion;

public class problem4 {

    public static int Sum(int n){
        if(n == 1){         // BASE CASE
            return 1;
        }
        int snm1 = Sum(n-1);  // N + SUM(N-1)
        int sn = n + snm1;
        return sn;
    }

    public static void main(String[] args) {
        int n = 40;
        System.out.println(Sum(n));
    }
}
