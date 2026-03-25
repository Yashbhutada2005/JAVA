package P_Stack;

public class B_StackUsingLinkedList {
    
    static class Node {
        int data ;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        } 

        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(3);
        s.push(2);
        s.push(1);

        while(! s.isEmpty()){
            System.out.println("Stack after pop : " + s.peek());
            s.pop();
        }
    }
}
