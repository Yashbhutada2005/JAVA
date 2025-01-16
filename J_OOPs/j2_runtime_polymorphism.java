package J_OOPs;

class Animal {

    void sound()
    {
        System.out.println("Animal voices");
    }
}

class Dog extends Animal {

    void sound()
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
