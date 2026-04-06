package P_Stack;

import java.util.Stack;

public class M_PostfixEvaluation {
    
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
        String str = "264/8*+3-";

        Stack<Integer> vs = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> ps = new Stack<>();

        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                vs.push(ch - '0');
                is.push(ch + "");
                ps.push(ch + "");
            }
           
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v2 = vs.pop();
                int v1 = vs.pop();
                int val = operation(v1, v2, ch);
                vs.push(val);

                String iv2 = is.pop();
                String iv1 = is.pop();
                String ival = "(" + iv1 + ch + iv2 + ")";
                is.push(ival);
                
                String pv2 = ps.pop();
                String pv1 = ps.pop();
                String pval = ch + pv1 + pv2 ;
                ps.push(pval);

            }
        }
                System.out.println("Value : " + vs.peek());
                System.out.println("Postfix : " + ps.peek());
                System.out.println("Infix : " + is.peek());
        
    }
}
