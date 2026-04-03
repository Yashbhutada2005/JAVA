package P_Stack;

import java.util.Stack;

public class K_LargeAreaHistogram {
    
    public static int largestArea(int arr[]){

        Stack<Integer> s = new Stack<>();
        int MaxArea = 0;
        int n = arr.length;

        int left[] = new int[n];
        int right[] = new int[n];

        // Next Smaller to Left
        for(int i=0; i<n; i++){

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                left[i] = -1;
            }
            else {
                left[i] = s.peek();
            }
            s.push(i);
        }
        s.clear();

        // Next Smaller to right
        for(int i = n -1; i >= 0; i--){

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                right[i] = n; 
            }
            else {
                right[i] = s.peek();
            }
            s.push(i);
        }

        for(int i = 0; i < n; i++){
            int width = right[i] - left[i] - 1;
            int area  = arr[i] * width;

            MaxArea = Math.max(MaxArea , area);
        }
        return MaxArea;
    }
    public static void main(String[] args) {
        
        int arr[] = { 2,1,5,6,2,3};
        System.out.println(largestArea(arr));
    }
}
