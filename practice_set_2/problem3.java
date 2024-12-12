// check wheter the year entered by the user is leap year or not

package practice_set_2;
import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        
        System.out.println("Enter the year :");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // if a year is divisible by 4 but not by 100 or divisible by 400 then a year is a leap year
        if((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)) {
                System.out.println("The Year is a Leap Year " + year);
        }
        else {
            System.out.println("The Year is not a Leap year");
        }
    }
    
}
