package OOP_practice_set;

class Shapes {
    public void draw(){
        System.out.println();
    }
}
class Square extends Shapes {
    @Override
    public void draw(){
        System.out.println("DRAW A SQUARE");
    }
}

class Rectangle extends Shapes {
    @Override
    public void draw(){
        System.out.println("DRAW A RECTANGLE");
    }
}

class Triangle extends Shapes {
    @Override
    public void draw(){
        System.out.println("DRAW A TRIANGLE");
    }
}

class Circle extends Shapes {
    @Override
    public void draw(){
        System.out.println("DRAW A CIRCLE");
    }

}
public class problem8 {
    public static void main(String[] args) {
        Shapes s = new Square();
        Shapes r = new Rectangle();
        Shapes t = new Triangle();
        Shapes c = new Circle();

        s.draw();
        r.draw();
        t.draw();
        c.draw();

    }
}
