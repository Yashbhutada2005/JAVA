package J_OOPs;

class A {
    int age;

    // default constructor 
    // A() {
    //     age = 12;    // O/P - 12
    // }

    // as constructor is comment out then a java will provide a default constructor 
     
    void dio() {
        System.out.println(age);  // O/P - 0
    }
}
public class b1_defaultconstructor {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.dio();
    }
    
}
