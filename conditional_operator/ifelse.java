package conditional_operator;

import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("your age is " + age);
        if(age > 18) {
            System.out.println("adult");
        } 
        if(age>13 && age<18) {
            System.out.println("teenager");
        }
        else {
            System.out.println("not adult");
        }
    }
}

    
   
