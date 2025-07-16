// ABSTRACT CLASS

package J1_OOP_practice_set ;

abstract class Animal {
   abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog Barks!!");
    }
}

class Cat extends Animal {
    @Override
    void sound(){
        System.out.println("Cat Meows!!");
    }
}
public class problem9 {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();
    }
    
}
