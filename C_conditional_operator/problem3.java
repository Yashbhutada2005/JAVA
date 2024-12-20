// income tax slab

import java.util.*;
public class problem3 {
    public static void main(String[] args) {
        System.out.println("enter salary :");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();

        if (salary < 500000) {
            System.out.println("0 % income tax ");
        }
        else if (salary > 500000 && salary < 1000000) {
            System.out.println("20 % income tax");
        }
        else {
            System.out.println("30 % income tax");
        }
        sc.close();

        }
    }
    
