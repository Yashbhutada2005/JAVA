package J_OOPs;

      /* RUN TIME POLYMORPHISM  */

      // METHOD OVERRIDING

class Animal {              // PARENT CLASS

    void sound()
    {
        System.out.println("Animal voices");
    }
}

class Dog extends Animal {     // CHILD CLASS 

    @Override
    void sound()      // METHOD OVERRIDEN
    {
        System.out.println("Dog Barks!!");
    }
}

public class j2_runtime_polymorphism {

    public static void main(String[] args) {
        
        Animal obj = new Dog();

        obj.sound();
    }
    
}
