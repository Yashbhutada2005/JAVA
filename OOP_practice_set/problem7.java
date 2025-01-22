// INHERITANCE - SINGLE INHERITANCE
// VEHICLE - METHOD MOVE AND SUBCLASS CAR.

package OOP_practice_set;

class Vehicle {
    public void move(){
        System.out.println("Vehicle is moving");
    }
}
class Car extends Vehicle {
   @Override
    public void move(){
        System.out.println("Car is Driving");
    }
}
public class problem7 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.move();

        Car car = new Car();
        car.move();
    }
    
}