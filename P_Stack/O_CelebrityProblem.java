package P_Stack;

import java.util.Stack;

public class O_CelebrityProblem {
    
    public static void FindCelebrity(int[][] m){

        Stack<Integer> s = new Stack<>();

        for(int i=0; i<m.length; i++){
            s.push(i);
        }

        while(s.size() > 1){
            int i = s.pop();
            int j = s.pop();

            if(m[i][j] == 1){
                s.push(j);
            }
            else {
                s.push(i);
            }
        }

        int pot = s.pop();
        for(int i=0; i<m.length; i++){
            if(i != pot){
                if(m[i][pot] == 0 || m[pot][i] == 1){
                    System.out.println("None");
                    return;
                }
            }
        }
        System.out.println("Celebrity is " + pot);
    }
    public static void main(String[] args) {
        
        int[][] m = {{0,1,1,0},
                    {0,0,1,0},
                    {0,0,0,0},
                    {0,1,1,0}
        };

        FindCelebrity(m);
    }
}

