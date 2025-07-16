// Animal - Mammal , bird , reptile

package J1_OOP_practice_set ;

class Animal {
    private String name;
    private String species;
    private int age;

    Animal(String name , String species , int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

   public void display(){
        System.out.println("Name :" + name);
        System.out.println("Species :" + species);
        System.out.println("Age : " + age);
    }
}

public class problem5 {
    static class Mammal extends Animal {
        public Mammal(String name , String species , int age){
            super(name, species, age);
        }
    }

   static class Bird extends Animal {
        public Bird(String name , String species , int age){
            super(name, species, age);
        }
    }

  static class Reptile extends Animal {
        public Reptile(String name , String species , int age){
            super(name, species, age);
        }
    }

    public static void main(String[] args) {

        Mammal obj = new Mammal("Elephant", "Elephas Maximas", 25);
        Reptile obj1 = new Reptile("Cobra", "Napa", 5);
        Bird bird = new Bird("Peackock", "Aquila", 3);

        obj.display();
        obj1.display();
        bird.display();
    }
    
}
