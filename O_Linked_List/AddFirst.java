package O_Linked_List;

public class AddFirst {
    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addfirst(int data){
        
        // step 1 - create a new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 2 - newNode next = head 
        newNode.next = head ; // link

        // step 3 - head = newNode
        head = newNode;
    }
    public static void main(String[] args) {
        AddFirst l1 = new AddFirst();
        l1.addfirst(0);
        l1.addfirst(1);
        l1.addfirst(2);
        System.out.println(l1);
    }
}
