// INTERFACE CLASS (ABSTRACTION)

package J1_OOP_practice_set ;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
   public void start() {
        System.out.println("Car is Starting ");
    }

    @Override
    public void stop(){
        System.out.println("Car is Stoping ");
    }
}

class Bike implements Vehicle {
    @Override
    public void start(){
        System.out.println("Bike is Starting ");
    }

    @Override
    public void stop(){
        System.out.println("Bike is Stopping ");
    }
}
public class problem11 {
    public static void main(String[] args) {
        
        Car car = new Car();

        System.out.println("Car :");
        car.start();
        car.stop();

        System.out.println();

        Bike bike = new Bike();

        System.out.println("Bike :");
        bike.start();
        bike.stop();
    }
    
}
