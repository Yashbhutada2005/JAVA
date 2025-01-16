package J_OOPs;

class cars {
    void w()
    {
        System.out.println("Brands :");
    }
}

class C extends cars {
    void x() 
    {
        System.out.println("Bentley ");
        System.out.println();
    }
}

class D extends cars {
    void y()
{
    System.out.println("Rolls Royce");
    System.out.println();
}
}

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
        no.w();
        no.z();

        D no1 = new D();
        no1.w();
        no1.y();

        C no2 = new C();
        no2.w();
        no2.x();
    }
    
}
