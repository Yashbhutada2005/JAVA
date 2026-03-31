// Logic of Problem
/*
I/P : ((a+b)+(a+b))   O/P : false
     logic : 1. '(' push onto stack  
             2. ')' pop from stack , jab tak close bracket nhi dikta tab tak pop karte chalna
             3. do one extra pop
             4. if ')' ke just baad '(' ho or koi bhi element na ho toh false
             5. aur agar ho toh true
*/


package P_Stack;

import java.io.*;
import java.util.*;

public class G_DuplicateBrackets {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){
                    System.out.println(true);
                    return;
                }
                else {
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        System.out.println(false);
        sc.close();
    }
}
