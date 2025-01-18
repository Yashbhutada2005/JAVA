package J_OOPs;

interface sahil {
    public void sound();
    public void eat(); 
}

class yash implements sahil {
    public void sound() {
        System.out.print("Sahil sounds like ");
        System.out.print("AAH");
    }
    public void eat() {
        System.out.println("sahil eats apple");
    }
}
public class l2_interfaceclass {
    public static void main(String[] args) {
        
   sahil obj = new yash() ;
        obj.eat();
        obj.sound();
    }
}
