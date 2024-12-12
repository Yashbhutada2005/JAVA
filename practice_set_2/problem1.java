// check wheter student is pass or fail

package practice_set_2;
import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        
    System.out.println("enter marks 1 :");
    Scanner m1 = new Scanner(System.in);
    float marks_1 = m1.nextFloat();

    System.out.println("enter marks 2 :");
    Scanner m2 = new Scanner(System.in);
    float marks_2 = m1.nextFloat();

    System.out.println("enter marks 3 :");
    Scanner m3 = new Scanner(System.in);
    float marks_3 = m1.nextFloat();

    float avg = (marks_1+marks_2+marks_3);
    System.out.println((avg / 300) * 100);

    if(marks_1>= 33 && marks_2 >=33 & marks_3 >= 33 && avg >= 40 ) {
        System.out.println("congratulation you are passed");

    }
    else {
        System.out.println("you are fail");
    }
    }
}
