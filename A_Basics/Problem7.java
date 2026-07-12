// Swap two numbers without using a third variable.

package A_Basics;

public class Problem7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 15;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a+b;   // 20
        b = a-b;   // 5
        a = a-b;   // 15

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }    
}
