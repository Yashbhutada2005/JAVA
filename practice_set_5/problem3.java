// class square , side , area

package practice_set_5;

public class problem3 {
    
    public static class square{

        double side;
        public double area(){
            return side*side;
        }
        public double perimeter(){
            return 4*side;
        }
        public static void main(String[] args) {
            
        square shape = new square();

        shape.side = 12;
        System.out.println("Side of Square : " + shape.side);
        System.out.println("Area of Square : " + shape.area());
        System.out.println("Perimeter of Square : " + shape.perimeter());
        }
    }
}
