package P_Stack;

import java.util.Stack;
import java.util.*;

public class L_InfixEvaluation {
    
    public static int prefrence(char op){
        if(op == '+' || op == '-'){
            return 1;
        }
        if(op == '*' || op == '/'){
            return 2;
        }
        return 0;
    }

    public static int Evaluation(int v1 , int v2 , char op){
        if(op == '+'){
            return v1 + v2;
        }
        if(op == '-'){
            return v1 - v2;
        }
        if(op == '*'){
            return v1 * v2;
        }
        if(op == '/'){
            return v1 / v2;
        }
        return 0;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String Exp = sc.nextLine();

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for(int i = 0; i < Exp.length(); i++){
            char ch = Exp.charAt(i);

            if(ch == '('){
                operators.push(ch);
            }
            else if (ch == ')'){
                while(operators.peek() != '('){
                    char op = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int result = Evaluation(v1, v2, op);
                    operands.push(result);
                }
                operators.pop();
            }
            else if(Character.isDigit(ch)){
                operands.push(ch - '0');
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while (!operators.isEmpty() && operators.peek() != '(' && prefrence(ch) <= prefrence(operators.peek())) {
                 char op = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int result = Evaluation(v1, v2, op);
                    operands.push(result);
                }
                operators.push(ch);
            }
        }
        while(! operators.isEmpty()){
            char op = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();

            int result = Evaluation(v1, v2, op);
            operands.push(result);

            System.out.println(operands.peek());
        }
    }
}
