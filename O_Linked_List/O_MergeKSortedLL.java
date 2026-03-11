package O_Linked_List;

public class O_MergeKSortedLL {
    
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node MergeKSortedLL(Node A , Node B){
        Node temp = new Node(0);   // create a temp Node
        Node curr = temp;               // use to build new LL

        while (A != null && B != null) {
            if(A.data < B.data){
                curr.next = A;
                A = A.next;
            }
            else {
                curr.next = B;
                B = B.next;
            }
            curr = curr.next;
        }

        if(A != null){
            curr.next = A;
        }
        if(B != null){
            curr.next = B;
        }
        return temp.next;
    }

    public static Node mergeKList(Node[] listArray){
        Node merge = null;

        for(int i = 0; i < listArray.length; i++){
            merge = MergeKSortedLL(merge, listArray[i]);
        }
        return merge;
    }

    public static void printlist(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        
        Node list1 = new Node(1);
        list1.next = new Node(6);

        Node list2 = new Node(2);
        list2.next = new Node(8);

        Node list3 = new Node(4);
        list3.next = new Node(7);  

        Node[] allList = {list1 , list2 , list3};

        Node finalList = mergeKList(allList);

        System.out.println("Final Linked List :");
        printlist(finalList);
    }
}
