package J_OOPs;
      /*  INTERFACE CLASS  */

//INTERFACE CLASS
interface sahil {
    public void sound();
    public void eat(); 
}

// CHILD CLASS
class yash implements sahil {
    public void sound() {                          // METHOD DECLARATION
        System.out.print("Sahil sounds like ");
        System.out.print("AAH");
    }
    public void eat() {                            // METHOD DECLARATION
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
