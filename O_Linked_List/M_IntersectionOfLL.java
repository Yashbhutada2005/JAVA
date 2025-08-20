package O_Linked_List;

public class M_IntersectionOfLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node getIntersectionNode(Node headA, Node headB) {

        Node tempA = headA;
        Node tempB = headB;

        int lengthA = 0;
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }

        int lengthB = 0;
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;

        if(lengthA > lengthB){
            int steps = lengthA - lengthB;
            for(int i = 1; i <= steps; i++){
                tempA = tempA.next;
            }
        }
        else {
            int steps = lengthB - lengthA;
            for(int i = 1; i <= steps; i++){
                tempB = tempB.next;
            }
        }

        while(tempA != null && tempB != null){
            if(tempA == tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }

    public static void main(String[] args) {
        M_IntersectionOfLL ll = new M_IntersectionOfLL();

        Node common = new Node(6);
        common.next = new Node(7);

        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        headA.next.next.next = common;

        Node headB = new Node(4);
        headB.next = new Node(5);
        headB.next.next = common;

        Node result = getIntersectionNode(headA, headB);

        if(result != null){
            System.out.println("Intersection at Node with data : " + result.data);
        }
        else {
            System.out.println("No intersection found");
    }
    }
}
