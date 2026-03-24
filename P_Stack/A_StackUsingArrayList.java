package P_Stack;

import java.util.ArrayList;

public class A_StackUsingArrayList {
    
    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // PUSH
        public void push(int data){
            list.add(data);
        }

        // POP
        public static int pop() {
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // PEEK
        public static int peek() {
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }
    public static void main(String[] args) {
        
        Stack s = new Stack();
        s.push(3);
        s.push(2);
        s.push(1);

        // this statment will print till stack is not empty , it will print top element then will pop it till the stack is empty
        while(!s.isEmpty()){
            System.out.println("Stack after pop : " + s.peek());
            s.pop();
        }
    }
}
