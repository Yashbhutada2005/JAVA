package J_OOPs;

      /*  ABSTRACTION - ABSTRACT CLASS  */


abstract class humans {               // ABSTRACT CLASS (USING ABSTRACT KEYWORD)
    public abstract void eat();       // ABSTRACT METHOD 
}


// inheritance is must
class Veg extends humans {           // CHILD CLASS1
 public void eat()
 {
    System.out.println("Vegetarian will eat panner , vegetables etc");
 }
}

class Nonveg extends humans {      // CHILD CLASS 2
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
