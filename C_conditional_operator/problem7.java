// Pythagoran Triplet

package C_conditional_operator;

import java.util.*;

public class problem7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if(b >= max){
            max = b;
        }
        if(c >= max){
            max = c;
        }

        boolean isTriplet = false;
        if(max == a){
            isTriplet = ((b*b + c*c) == (a*a));
        }
        else if(max == b){
            isTriplet = ((a*a + c*c) == (b*b));
        }
        else {
            isTriplet = ((a*a + b*b) == (c*c));
        }

        if(isTriplet){
            System.out.println("it is Pythagoran Triplet");
        }
        else {
            System.out.println("not a Pythagoran Triplet");
        }
        sc.close();
    }
}
