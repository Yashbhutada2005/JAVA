package O_Linked_List;

public class H_RemoveACycle {

    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

     public static boolean isCycle(){

        Node slow = head;   // slow and fast star from head
        Node fast = head;

        while(fast != null && fast.next != null){    // this condition is used to check if LL is linear
            slow = slow.next;  // +1
            fast = fast.next.next;   // +2

            if(slow == fast){   // slow and fast comes in same point it is cyclic
                return true;
            }
        }
        return false;
    }

    public static void RemoveCycle(){

        // DETECT A CYCLE

        Node slow = head;
        Node fast = head;
        boolean cycle = false;   // initially cycle is 0

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;   // cycle is true
                break ;
            }
        }
        if(cycle == false){
            return;
        }
    
        // FIND MEETING POINT
        slow = head;                // then start slow from head
        Node prev = null;           // initialize prev as null
        while(slow != fast){
            prev = fast;            // put prev as fast
            slow = slow.next;       // +1
            fast = fast.next;       // +1
        }

        // REMOVE CYCLE
        prev.next = null ;          // make prev.next as null to break the link
    }
    public static void main(String[] args) {
        
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next.next;


        System.out.println("Is Linked List Cyclic : " + isCycle());
        RemoveCycle();
        System.out.println("Is Linked List Cyclic : " + isCycle());

    }
}
