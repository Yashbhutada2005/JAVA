package P_Stack;

import java.util.Stack;

public class N_PrefixEvaluation {
    
    public static int operation(int v1 , int v2 , char op){

        if(op == '+'){
            return v1+v2;
        }
        if(op == '-'){
            return v1-v2;
        }
        if(op == '*'){
            return v1*v2;
        }
        if(op == '/'){
            return v1/v2;
        }
        return 0;

    }
    public static void main(String[] args) {
        
        String str = "-+2/6483";

        Stack<Integer> s = new Stack<>();

        for (int i = str.length()-1 ; i >= 0; i--){
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                s.push(ch - '0');
            }
            else {
                int v1 = s.pop();
                int v2 = s.pop();
                int val = operation(v1, v2, ch);
                s.push(val);
            }
        }
        System.out.println("Final Value : " + s.peek());
    }
}
