package P_Stack;

import java.util.Stack;

public class P_SmallestNumberFollowing {
    
    public static void main(String[] args) {

        String str = "diddid";
        
        Stack<Integer> s = new Stack<>();
        int num = 1;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'd'){
                s.push(num);
                num++;
            }
            else {
                s.push(num);
                num++;

                while(s.size() > 0){
                    System.out.print(s.pop());
                }
            }
        }
        s.push(num);
        while(s.size() > 0){
           System.out.print(s.pop());
        }
    }
}
