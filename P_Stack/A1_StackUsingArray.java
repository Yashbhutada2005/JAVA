package P_Stack;

import java.util.Stack;

public class A1_StackUsingArray {
        
        int arr[] = new int[5];
        int top = -1;

        void push(int x){
            if(top == 4){
                System.out.println("OverFlow");
            }
            else {
                arr[++top] = x;
            }
        }

        void pop(){
            if(top == -1){
                System.out.println("UnderFlow");
            }
            else {
                System.out.println(arr[top--]);;
            }
        }

        void peek(){
            if(top == -1){
                System.out.println("Empty");
            }
            else {
                System.out.println(arr[top]);
            }
        }

        public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        
        s.push(3);
        s.push(2);
        s.push(1);

        System.out.print(s);
        }
    
}
