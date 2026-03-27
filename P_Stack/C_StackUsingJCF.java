package P_Stack;

import java.util.*;

public class C_StackUsingJCF {
    
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();

        s.push(3);
        s.push(2);
        s.push(1);

        System.out.println("PEEK : " + s.peek());

        s.pop();
        System.out.println("AFTER POP : " + s.peek() );
    }
}
