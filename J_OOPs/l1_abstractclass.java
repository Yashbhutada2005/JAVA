package J_OOPs;

abstract class humans {
    public abstract void eat();
}

class Veg extends humans {
 public void eat()
 {
    System.out.println("Vegetarian will eat panner , vegetables etc");
 }
}

class Nonveg extends humans {
    public void eat() {
        System.out.println("Non - vegetarian will eat chicken , mutton etc");
    }
}


public class l1_abstractclass {
    public static void main(String[] args) {
        
        Veg i = new Veg();
        Nonveg k = new Nonveg();

        i.eat();
        k.eat();

    }
    
}
