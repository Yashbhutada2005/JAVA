package F_function_methods;

public class functionoverloading {
     public static int sum(int a , int b) {
        return a + b;
     }
     public static int mul(int a , int b , int c ) {
        return a*b*c ;
     }
     public static int sum(int a , int b , int c) {
        return a+b+c ;
     }
     public static double div(double a , double b) {
        return a/b;
     }
     public static long mod(long a , long b) {
        return a%b;
     }
     public static void main(String[] args) {
        System.out.println(sum(43 , 76));
        System.out.println(mul(43, 1, 4));
        System.out.println(sum(34,87));
        System.out.println(div(600.65 , 20.23));
        System.out.println(mod(3245 , 1234));
     }
}
