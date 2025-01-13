package J_OOPs;

public class e_static_variable {
    
   static class mobile {           // static class

        String name ;
        String brand ;
        static int price ;       // shared among all the object
        
        public void information() {
            System.out.println(name + " : " + brand + " : " + price);
        }
    }

    public static void main(String[] args) {
        
        mobile obj1 = new mobile() ;
        mobile obj2 = new mobile() ;

        obj1.name = "Iphone";
        obj1.brand = "Apple";
        mobile.price = 1200;      // shared for both 

        obj2.name = "Samsung s21";
        obj2.brand = "Samsung";

        obj1.information();
        obj2.information();
    }
}
