package J_OOPs;

class bike {
    String b;
    int y;

    bike(String b , int y ){
       this.b = b;
       this.y = y;
    }

    void show(){
        System.out.println("BIKE DETAILS :");
        System.out.println("Brand : " + b );
        System.out.println("Price : " + y);
    }
}
public class b2_parameterizedconstructor {
    public static void main(String[] args) {
        
        bike obj = new bike("Yamaha", 120000);
        bike obj1 = new bike("royal enfield", 200000);

        obj.show();
        obj1.show();
    }
    
}
