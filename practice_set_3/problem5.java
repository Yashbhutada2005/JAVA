// sum of a multiplication table 

package practice_set_3;
import java.util.*;
public class problem5 {
    public static void main(String[] args) {
        
        int n=8;
        int sum = 0;
        for(int i= 1; i <= 10 ; i++) {
            int j = n*i;
            sum += j;    
        }
        System.out.println("the sum of table of 8 is " + sum);
    }
    
}
