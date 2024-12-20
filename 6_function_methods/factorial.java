package function_methods;

public class factorial {
    
    public static long factorial(long  n) {
        long f = 1;

        for(long i = 1; i<= n ; i++) {
            f = f * i ;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(factorial(67));
    }
    }