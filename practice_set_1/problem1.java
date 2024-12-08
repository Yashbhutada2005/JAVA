//CGPA calculator

package practice_set_1;
import java.util.*;

public class problem1 {
    public static void main(String[] args) {
        
        System.out.print("Enter marks 1 :");
        Scanner sc = new Scanner(System.in);
        float marks_1 = sc.nextFloat();

        System.out.print("Enter marks 2 :");
        Scanner sca = new Scanner(System.in);
        float marks_2 = sca.nextFloat();
        
        System.out.print("Enter marks 3 :");
        Scanner scan = new Scanner(System.in);
        float marks_3 = scan.nextFloat();

        float total_marks;
        total_marks = marks_1 + marks_2 + marks_3;
        System.out.println("total marks is " + total_marks);

        float percentage ;
        percentage = ( total_marks / 300 ) * 100 ;
        System.out.println("percentage is " + percentage); 
        
        float CGPA;
        CGPA = (percentage / 9.5f);
        System.out.println("CGPA is " + CGPA);
        
    }
    
}
