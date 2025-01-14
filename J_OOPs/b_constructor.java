package J_OOPs;

class student {
    String name ;
    int rollno;
    int marks;

    student(){
        name = "Yash";
        this.rollno = 52;
        this.marks = 94;
    }

    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Roll no. " + rollno);
        System.out.println("Marks : " + marks);
    }
}
public class b_constructor {

    public static void main(String[] args) {
        
        student obj = new student();
       obj.display();
    }
    
}
