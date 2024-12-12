// total tax payed

package practice_set_2;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        
        System.out.println("income :");
        Scanner s = new Scanner(System.in);
        int income = s.nextInt();

        if(income > 250000 && income < 500000) {
            System.out.println("Not in tax slab");
        }
        if(income > 500000 && income < 1000000) {
            income = income - (income * 5/100);
            System.out.println("Your income after Tax deduction is " + income);
        }
        if (income >= 1000000 && income <= 1500000) {
            income = income - (income * 15/100);
            System.out.println("Your income after tax deduction is " + income);
        }
        if (income >= 1500000) {
            income = income - (income * 30/100);
            System.out.println("Your income after tax deduction is " + income);
        }
        s.close();
    }
}
