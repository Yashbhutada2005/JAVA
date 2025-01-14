package J_OOPs;

public class f_static_method {
    
    static class man{            // static class
        static String name;      // static variable
        static int age;


        public static void dop() {     // static method
            System.out.println(name);
            System.out.println(age);
        }
    }
    public static void main(String[] args) {

        man.name = "Yash Bhutada";
        man.age = 20;

        man.dop();       // called static method directly using class name
    }
}
