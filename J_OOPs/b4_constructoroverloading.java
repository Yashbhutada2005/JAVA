package J_OOPs;

class B {
    String brand;
    int price;

    // CONSTRUCTOR OVERLOADING

    B(){                                 // default constructor
    }

    B(String b){                          // parameterized constructor with one parameter
        this.brand = b;
    }

    B(String b, int y){                 // parameterized constructor with two parameter
        this.brand = b;
        this.price = y;
    }

   public void show() {
    System.out.println("BIKE DETAILS :");
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println();
    }

}
public class b4_constructoroverloading {

  public static void main(String[] args) {
    
    B obj = new B();
    B obj1 = new B("Honda");
    B obj2 = new B("harley", 765435);

    obj.show();
    obj1.show();
    obj2.show();
  }
    
}
