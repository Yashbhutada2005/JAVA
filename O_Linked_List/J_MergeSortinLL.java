package O_Linked_List;

public class J_MergeSortinLL {

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


    // MID POINT
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;       // slow will be midpoint
    }

    // Merge 
    public Node merge(Node head1 , Node head2){
        Node mergeLL = new Node(-1);             // new LL with initial Node -1
        Node temp = mergeLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){        // check the lowest value from both head
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
        }
        return mergeLL.next;    
    }
    
    // MERGE SORT
    public Node mergesort(Node head){

        if(head == null || head.next == null){
            return head;
        }
        
        // FIND MID
        Node mid = getMid(head);

        // LEFT AND RIGHT MS
        Node righthead = mid.next;
        mid.next = null;
        Node newLeft = mergesort(head);
        Node newRight = mergesort(righthead);

        // MERGE
        return merge(newLeft , newRight);
    }
    public static void main(String[] args) {
        
        J_MergeSortinLL ll = new J_MergeSortinLL();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        System.out.println("LinkedList before Merge Sort : ");
        ll.printList();

        System.out.println();

        System.out.println("LinkedList after Merge Sort : ");
        ll.head = ll.mergesort(ll.head);
        ll.printList();

    }
}
