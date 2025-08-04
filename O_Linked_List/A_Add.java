package O_Linked_List;

public class A_Add {
 
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;       // to check the size of LL

    // ADD FIRST
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++ ;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // ADD AT SPECIFIC INDEX
    public void add(int index , int data){

        if(index == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++ ;
        Node temp = head;
        int i = 0;

        while(i < index-1){
            temp = temp.next ;
            i++ ;
        }

        newNode.next = temp.next;
        temp.next = newNode ;
    }
    

    // ADD LAST
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++ ;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // PRINT LINKED LIST
    public void printList() {

        if (head == null){
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        A_Add l1 = new A_Add();
        l1.addFirst(30);
        l1.printList();
        l1.addFirst(20);
        l1.printList();
        l1.addFirst(10);
        l1.printList();

        l1.addLast(40);
        l1.printList();
        l1.addLast(50);
        l1.printList();
        l1.addLast(60);
        l1.printList();

        System.out.println();
        System.out.println("Add at Specific Index :");
        l1.add(3, 100);
        l1.printList();

        System.out.println();
        System.out.println("Final Linked List : ");
        l1.printList();
          // Output: 10 20 30 40 50 60


          System.out.println();
          System.out.println("Size of The Linked List : " + l1.size);
    }
}
