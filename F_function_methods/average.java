//   AVERAGE OF 3 NUMBERS

package F_function_methods;
    import java.util.*;
        public class average {
            
            public static void CallAverage(float a , float b, float c) {

                float average = (a + b+ c )/3;
                System.out.println("Average : " + average);
            } 

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a :");
                float a = sc.nextInt();

                System.out.println("Enter b :");
                float b = sc.nextInt();

                System.out.println("Enter c :");
                float c = sc.nextInt();

                CallAverage(a, b, c);

                sc.close();


            }
}
