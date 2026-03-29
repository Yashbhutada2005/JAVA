package P_Stack;

import java.util.Stack;

public class E_ReverseAString {
    
    public static void main(String[] args) {
        
        String str = "YASH";

        Stack<Character> s = new Stack<>();

        // PUSH CHARACTER
        for(int i = 0; i < str.length(); i++){
            s.push(str.charAt(i));
        }

        System.out.println("REVERSED STRING : ");
        
        // POP AND PRINT REVERSE STRING
        while(!s.isEmpty()){
            System.out.print( s.pop());
        }
    }
}
