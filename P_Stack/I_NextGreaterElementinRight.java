package P_Stack;

import java.util.Stack;

public class I_NextGreaterElementinRight {
    
    public static void nextGreater(int arr[]){

        int n = arr.length;
        int result[] = new int[n];

        Stack<Integer> s = new Stack<>();

        for(int i = n-1; i >= 0; i--){

            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                result[i] = -1;
            }
            else {
                result[i] = s.peek();
            }

            s.push(arr[i]);
        }

        for(int x : result){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {2,5,1,7,9,3,8};
        nextGreater(arr);
    }
}
