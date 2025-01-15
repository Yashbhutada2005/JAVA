package J_OOPs;

class A {
    int age;

    // default constructor 
    A() {
        age = 12;    // O/P - 12
    }

    void dio() {
        System.out.println(age);
    }
}
public class b1_defaultconstructor {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.dio();
    }
    
}
