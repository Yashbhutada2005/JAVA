package P_Stack;

import java.util.Stack;

public class J_StockSpaan {
    
    public static void Stock(int[] price){

        int n = price.length;
        int span[] = new int[n];

        Stack<Integer> s = new Stack<>();

        s.push(0);
        span[0] = 1;

        for(int i = 1; i < n; i++){

            while(! s.isEmpty() && price[s.peek()] < price[i]){
                s.pop();
            }

            if(s.isEmpty()){
                span[i] = i+1;
            }
            else {
                span[i] = i - s.peek();
            }
            s.push(i);
        }
        for(int x : span){
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        
        int price[] = {100, 80, 60, 70, 60, 75, 85};
        Stock(price);
    }
}
