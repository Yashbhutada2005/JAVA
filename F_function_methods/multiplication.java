package F_function_methods;
import java.util.*;
public class multiplication {
    public static int Calculatemul(int a , int b) { // parameter or formal parameter 
        int mul = a * b;
        System.out.println("multiplication :" + mul);
        return mul;
}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();
        Calculatemul(a,b); // arguments or actual parameter

            sc.close();
    }
}
