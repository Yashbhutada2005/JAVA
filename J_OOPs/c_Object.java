package J_OOPs;

public class c_Object {

    public static class car {     // Class is created

        String colour;
        String brand;

         void car_details(){
            System.out.println("Brand : " + brand  +  "  Colour : " + colour);
  }
         }
         public static void main(String[] args) {
            
            car car1 = new car();    // creating car object
            car car2 = new car();    // car2 = refrence variable

            car1.brand = "toyota";    // attributes
            car1.colour = "red";
            car2.brand = "audi";
            car2.colour = "black";

            car1.car_details();   // calling object 
            car2.car_details();

         }
    
}
