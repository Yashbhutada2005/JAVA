package P_Stack;

import java.util.*;

public class D_PushAtBottom {

    public static void PushAtBottom (Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();         // pop all element 
        PushAtBottom(s, data);
        s.push(top);               // once stack gets empty add all element
    } 

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(3);
        s.push(2);
        s.push(1);

        PushAtBottom(s, 4);

        while(!s.isEmpty()){
            System.out.println("STACK : " + s.peek());
            s.pop();
        }
    }
    
}
