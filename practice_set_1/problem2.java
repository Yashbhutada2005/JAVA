//greet with taking input the name

package practice_set_1;

import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        System.out.println("Enter name :");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Hi "+name +" have a good day" );
        
     sc.close();   
    }
    
}
