// class square & rectangle , side , area , perimeter

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
        
        }
        public static class rectangle {
            double length;
            double breadth;
        public double area(){
            return length*breadth;
        }
        public double perimeter(){
            return 2*(length + breadth);
        }

        public static void main(String[] args) {
            
        square shape = new square();

        shape.side = 12;
        System.out.println("Area of Square : " + shape.area());
        System.out.println("Perimeter of Square : " + shape.perimeter());

        rectangle shapes = new rectangle();

        System.out.println("- - - - - - - - - - - - -");

        shapes.length = 11;
        shapes.breadth = 22;
        System.out.println("perimeter of rectangle : " + shapes.perimeter() );
        System.out.println("Area of rectangle : " + shapes.area());
        }
    }
}
