package C_conditional_operator;

import java.util.*;

public class calculator {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    System.out.println("enter number a :");
    float a = s.nextFloat();
    System.out.println("enter number b :");
    float b = s.nextFloat();
    System.out.println("select operator :");
    char operator = s.next().charAt(0);

    switch(operator) {
        case '+' : System.out.println(a+b);
                break;
        case '-' : System.out.println(a-b);
                break;
        case '*' : System.out.println(a*b);
                break;
        case '/' : System.out.println(a/b);
                break;
        case '%' : System.out.println(a%b);
                break;
        default : System.out.println("selected wrong operator");
    }
    s.close();
}
}