package J_OOPs;

class student {           // class
    String name ;
    int rollno;
    int marks;

    student(){           // constructor
        name = "Yash";
        this.rollno = 52;
        this.marks = 94;
    }

    void display() {            // function
        System.out.println("Name  : " + name);
        System.out.println("Roll no. " + rollno);
        System.out.println("Marks : " + marks);
    }
}
public class b_constructor {

    public static void main(String[] args) {
        
        student obj = new student();        // initialize
       obj.display();                       // display
        
    }
    
}
