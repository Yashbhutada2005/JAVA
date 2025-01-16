package J_OOPs;
 
     /* MULTILEVEL INHERITANCE */

        /*  A - B - C  */

// GRAND PARENT CLASS
class sports {
    void a()
    {
        System.out.println("Toss :");
    }
}

// PARENT CLASS
class sports1 extends sports {
    void b()
    {
        System.out.println("Bat");
        System.out.println("or");
    }
}

// CHILD CLASS
class sports2 extends sports1 {
    void c()
     {
        System.out.println("Ball");
     }
}

public class k2_multilevel_inheritance {
    public static void main(String[] args) {
        
        sports2 s = new sports2();

        s.a();
        s.b();
        s.c();
    }
    
}
