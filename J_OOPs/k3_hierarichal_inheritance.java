package J_OOPs;

      /*  HIERARICHAL INHERITANCE  */

// PARENT CLASS
class cars {
    void w()
    {
        System.out.println("Brands :");
    }
}

// CHILD CLASS 1
class C extends cars {
    void x() 
    {
        System.out.println("Bentley ");
        System.out.println();
    }
}

// CHILD CLASS 2
class D extends cars {
    void y()
{
    System.out.println("Rolls Royce");
    System.out.println();
}
}

// CHILD CLASS 3
class E extends cars {
    void z() 
    {
        System.out.println("Ferrari");

    System.out.println();
    }
}

public class k3_hierarichal_inheritance {
    public static void main(String[] args) {
        
        E no = new E();    
        no.w(); // PARENT CLASS METHOD
        no.z(); // CHILD CLASS 3

        D no1 = new D();
        no1.w(); // PARENT CLASS METHOD
        no1.y(); // CHILD CLASS 2

        C no2 = new C();
        no2.w(); // PARENT CLASS METHOD
        no2.x(); // CHILD CLASS
    }
    
}
