package O_Linked_List;

public class G_DetectACycle {

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
    public static void main(String[] args) {
        
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        System.out.println("Linked List is Cyclic : " + isCycle());
        
    }
}
