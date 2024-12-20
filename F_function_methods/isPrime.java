// CHECK WHETHER THE GIVEN NUMBER IS PRIME OR NOT

package F_function_methods;

    import java.util.*;
    public class isPrime {
    
        public static boolean isPrime(int n){
            boolean isPrime = true;

            if(n % 2 == 0) {
                isPrime = false;
            }
            return isPrime;
        }
        public static void main(String[] args) {
            
            System.out.println("Enter Number :");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            System.out.println(isPrime(num));
        }
}
