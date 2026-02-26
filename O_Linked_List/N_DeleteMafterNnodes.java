package O_Linked_List;

public class N_DeleteMafterNnodes {

    // Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to delete N nodes after M nodes
    public static Node DeleteMnodesAfterNnodes(Node head, int M, int N) {
        Node curr = head;

        while (curr != null) {
            // Skip M nodes
            for (int i = 1; i < M && curr != null; i++) {
                curr = curr.next;
            }

            if (curr == null) break;

            // Start deleting next N nodes
            Node temp = curr.next;
            for (int i = 0; i < N && temp != null; i++) {
                temp = temp.next;
            }

            // Connect M-th node to the node after N deletions
            curr.next = temp;
            curr = temp;
        }

        return head;
    }

    // Print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Main function to test
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        System.out.println("Before:");
        printList(head);

        head = DeleteMnodesAfterNnodes(head, 3, 2); // M = 3, N = 2

        System.out.println("After:");
        printList(head);
    }
}
