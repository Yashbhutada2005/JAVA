package OOP_practice_set;
import java.util.Scanner;

class Students {
   String name;
   int mark1 , mark2 , mark3;

   void display(){
double avg = (mark1 + mark2 + mark3)/3.0;
System.out.println("Name : " + name);
System.out.println("Average : " + avg);
   }
}

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students student = new Students();

        System.out.println("Enter the name of student :");
        student.name = sc.nextLine();

        System.out.println("Enter marks :");
        student.mark1 = sc.nextInt();
        student.mark2 = sc.nextInt();
        student.mark3 = sc.nextInt();

        student.display();
        sc.close();
    }
}
