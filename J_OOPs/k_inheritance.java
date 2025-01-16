package J_OOPs;

class animal {

    void janwar()
    {
        System.out.println("Animal : Dog");
    }
}

class dog extends animal {

    void eat () 
    {
        System.out.println("Eats pedigree");
    }
}

public class k_inheritance {

    public static void main(String[] args) {
        
        dog Dog = new dog();

        Dog.janwar();
        Dog.eat();
    }
    
}
