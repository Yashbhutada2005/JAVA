package J_OOPs;

public class g_static_block {
    
    static class oop {

        static int value ;

        // static block
        static {          
            System.out.println("value :");
            value = 123;
        }
        public static void main(String[] args) {
            
            System.out.println(value);
        }
    }
}
