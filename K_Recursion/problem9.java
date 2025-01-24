// POWER OF N

package K_Recursion;

public class problem9 {
    public static int Power(int x , int n){
        if(n == 0) {             // base case
            return 1;            // return 1
        }
        return x * Power(x, n-1);  // x*x(n-1)
    }
    public static void main(String[] args) {
        System.out.println(Power(2, 10));
    }
}
