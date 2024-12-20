//   AVERAGE OF 3 NUMBERS

package F_function_methods;
    import java.util.*;
        public class average {
            
            public static void CalAverage(int a , int b, int c) {

                float average = (a + b+ c )/3;
                System.out.println("Average : " + average);
            } 

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a :");
                int a = sc.nextInt();

                System.out.println("Enter b :");
                int b = sc.nextInt();

                System.out.println("Enter c :");
                int c = sc.nextInt();

                CalAverage(a, b, c);

                sc.close();


            }
}
