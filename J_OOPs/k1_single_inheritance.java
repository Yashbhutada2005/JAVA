package J_OOPs;
  
     /* SINGLE INHERITANCE */

// PARENT CLASS
class animal {

    void janwar()
    {
        System.out.println("Animal : Dog");
    }
}

// CHILD CLASS
class dog extends animal {   // ONLY ONE CHILD CLASS

    void eat () 
    {
        System.out.println("Eats pedigree");
    }
}

public class k1_single_inheritance {

    public static void main(String[] args) {
        
        dog Dog = new dog();

        Dog.janwar(); // PARENT CLASS
        Dog.eat();    // CHILD CLASS
    }
    
}
