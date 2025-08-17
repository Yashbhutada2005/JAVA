package O_Linked_List;

public class K_DoublyLL {
    
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

    // ADD LAST
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // REMOVE LAST
    public int removeFirst(){
        if(head == null){
            System.out.println("DDL is empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1){                // LL is of one node
            int val = head.data;
            head = tail = null;
            size-- ; 
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size-- ;
        return val;
    }

    // REMOVE LAST
    public int removeLast(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
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
        K_DoublyLL dll = new K_DoublyLL();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);

        System.out.println("Doubly Linked List : ");
        dll.print();

        System.out.println();

        dll.removeFirst();
        dll.removeLast();

        System.out.println("Doubly Linked List after Removing : ");
        dll.print();
    }

}
