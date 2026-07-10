// Print the Fibonacci series up to n terms.

package A_Basics;

public class Problem5 {
   public static void main(String[] args) {
    
    int n = 10;
    int a = 0;
    int b = 1;

    System.out.print("Fibonacci Series:  ");

    for(int i = 1; i <= n; i++){
        System.out.print(a + " ");

        int next = a+b;
        a = b;
        b = next;
    }
   }    
}
