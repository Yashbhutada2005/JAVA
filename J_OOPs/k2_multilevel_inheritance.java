package J_OOPs;

class sports {
    void a()
    {
        System.out.println("Toss");
    }
}

class sports1 extends sports {
    void b()
    {
        System.out.println("Bat");
        System.out.println("or");
    }
}

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
