package O_Linked_List;

public class Linked_List {
    public static class Node {
        int data;
        Node next;  // refers next node

        public Node(int data){
            this.data = data;
            this.next = null;  // thi will store next node as null
        }
    }

    public static Node head; // 1 element of LL
    public static Node tail; // last element of LL
    public static void main(String[] args) {
        Linked_List l1 = new Linked_List();
        System.out.println(l1);
        System.out.println("Linked List is Created");
        
    }
}
