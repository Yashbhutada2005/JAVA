package F_function_methods;
import java.util.*;
public class printasum {
    public static void CalculateSum() {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();
        int sum = a + b;

    System.out.println("Sum is " + sum);
    }
    
    public static void main(String[] args) {
        CalculateSum();

    }

}
