// PRINT A NUMBER FROM 10,9,....,1 

package K_Recursion;

public class problem1 {
    // RECURSICE FUNCTION
    public static void dec(int n){           
        if(n == 1){                    // BASE CASE
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");      // PRINT N
        dec(n-1);                       // TILL N-1
    }
    public static void main(String[] args) {
        int n= 10;        // LIMIT 10
        dec(n);
    }
}
