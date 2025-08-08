package O_Linked_List;

public class B_Remove {
    
public class Node {
    int data;
    Node next;

    public  Node(int data){
        this.data = data;
        this.next = null;
    }
}
    public static Node head;
    public static Node tail;
    public static int size;

    // add first 
    public void addfirst(int data){

        Node newnode = new Node(data);
        size++;
        if(head == null){
           head = tail = newnode;
           return; 
        }
        newnode.next = head;
        head = newnode;

    }

    // print 
    public void printList() {
       if(head == null){
        System.out.println("Linked List is Empty");
        return;
       } 

       Node temp = head;
    while(temp != null){
        System.out.print( temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
}

    // remove first
    public int removeFirst(){

        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
        // remove last 
        public int removeLast(){
            if(size == 0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }
            else if(size == 1){
                int val = head.data;
                head = tail = null;
                size -- ;
                return val;
            }
        
            Node prev = head;
            for(int i=0; i<size-2; i++){
                prev = prev.next;
            }

            int val = tail.data;
            prev.next = null;
            tail = prev;
            size-- ;
            return val;
        
    }
public static void main(String[] args) {
    B_Remove ll = new B_Remove();

    ll.addfirst(23);
    ll.addfirst(34);
    ll.addfirst(56);

    System.out.println("Orignal linked list : ");
    ll.printList();

    System.out.println("After remove first Linked List :" );
    ll.removeFirst();
    ll.printList();

    System.out.println("After remove last Linked list :");
    ll.removeLast();
    ll.printList();
    
}
}
