package O_Linked_List;

public class L_ReverseaDLL {
    
     public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // ADD FIRST
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode; 
    }

    // REVERSE A DLL
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            
            prev = curr;
            curr = next;
        }
        head = prev;
    }

     // PRINT
    public void print() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        L_ReverseaDLL dll = new L_ReverseaDLL();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        System.out.println("Doubly Linked List : ");
        dll.print();

        System.out.println();

        System.out.println("Reverse Doubly Linked List : ");
        dll.reverse();
        dll.print();
        
}
}
