package J_OOPs;

  /*  COMPILE TIME POLYMORPHISM */

  // METHOD OVERLOADING
class X {
    void add()                           // FUNCTION 1
    {
        int a  = 10 , b = 234 , c;
        c = a+b;
        System.out.println("SUM : " + c);
    }

    void add(double e , double f)        // FUNCTION 2
    {
        double g = e+f;
        System.out.println("SUM : " + g);
    }

    void add(double x , long y)           // FUNCTION 3
    {
        double z = x+y;
        System.out.println("SUM : " + z);
    }

}
public class j1_compile_polymorphism {

    public static void main(String[] args) {
        
        X obj = new X();

        obj.add();
        obj.add(2356.543, 764.3654);
        obj.add(764.4354, 4365432);
    }
    
}
