// FIBONACCI 

package K_Recursion;

public class problem5 {
    public static int fibbo(int n){
        if(n == 0){   // base case "n of 0" will return 0
            return 0;
        }
        if(n == 1){   // base case 2 "n of 1" will return 1
            return 1;
        }

        int fibboNm1 = fibbo(n-1);          // F(N-1)
        int fibbonm2 = fibbo(n-2);          // F(N-2)
        int fibbon = fibboNm1 + fibbonm2;   // F(N)
        return fibbon;
    }   
    public static void main(String[] args) {
        int n = 40;
        System.out.println(fibbo(n));
    } 
}
