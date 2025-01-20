// CALCULATION OF AREA OF DIFFRENT SHAPES

package OOP_practice_set;

import java.util.*;
abstract class Shapes {
    double CalArea() {
        System.out.println("Area :");
        return 0;
    }
}

class rectangle extends Shapes {
    double length;
    double breadth;

    public rectangle(double length , double breadth){
        this.breadth = breadth;
        this.length = length;
    }

    double CalArea(){
        return 2*(length + breadth);
    }
}

class square extends Shapes {
    double side;

    public square(double side){
        this.side = side;
    }
    double CalArea(){
        return 4*side;
    }
}

class circle extends Shapes {
    double radius;

    public circle(double radius){
        this.radius = radius;
    }
    double CalArea(){
        return 3.14 * radius * radius;
    }
}

class triangle extends Shapes {
    double len;
    double brd;

    public triangle(double len , double brd) {
        this.len = len;
        this.brd = brd;
    }
    double CalArea(){
        return 0.5 * len * brd;
    }
}

public class problem2 {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    while(true){
        System.out.println("Choose the Shape");
    System.out.println("1. Rectangle");
    System.out.println("2. square");
    System.out.println("3. circle");
    System.out.println("4. triangle");
    System.out.println("Enter your Choice :");
    int select = sc.nextInt();

    Shapes shape = null;

    switch(select) {

        case 1:
        System.out.println("Lenght :");
    double length1 = sc.nextDouble();
    System.out.println("Breadth :");
    double breadth1 = sc.nextDouble();
    shape = new rectangle(length1 , breadth1 );

        break;

        case 2:
        System.out.println("Side :");
        double side = sc.nextDouble();
       shape = new square(side);
        break;

        case 3:
        System.out.println("Radius :");
        double radius = sc.nextDouble();
       shape = new circle(radius);
        break;

        case 4 :
        System.out.println("Lenght :");
        double len1 = sc.nextDouble();
        System.out.println("Breadth :");
        double brd1 = sc.nextDouble();
        shape = new triangle(len1 , brd1);
        break;

        default :
        System.out.println("ERROR");
        sc.close();
        return;
    }
    if(shape != null) {
        System.out.println("AREA : " + shape.CalArea());
    }
}
}
}
