// CALCULATION OF AREA OF DIFFRENT SHAPES

package OOP_practice_set;

import java.util.*;
abstract class Shapes {        // abstract class
    double CalArea() {         // double function
        System.out.println("Area :");
        return 0;              // return the value as nothing is implemented
    }
}

// child class 1
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

// child class 2
class square extends Shapes {
    double side;

    public square(double side){
        this.side = side;
    }
    double CalArea(){
        return 4*side;
    }
}

// child class 3
class circle extends Shapes {
    double radius;

    public circle(double radius){
        this.radius = radius;
    }
    double CalArea(){
        return 3.14 * radius * radius;
    }
}

// child class 4
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

    while(true){         // the process will keep going until you choose exit
        System.out.println("Choose the Shape");
    System.out.println("1. Rectangle");
    System.out.println("2. square");
    System.out.println("3. circle");
    System.out.println("4. triangle");
    System.out.println("Enter your Choice :");
    int select = sc.nextInt();

    Shapes shape = null;     // variable declaration and initialization

    switch(select) {        // switch statment

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
    if(shape != null) {      // if condition to check if no. is 0 then it false
        System.out.println("AREA : " + shape.CalArea());
    }
}
}
}
