package O_Linked_List;

public class F_DeleteFromNthNode {

      public static class Node{

        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // ADD FIRST
    public void addFirst(int data){

        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    // PRINT 
    public static void printlist(){

        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    
    public void DeleteFromNthNode(int n){
        int sz = 0;
        Node temp = head;

        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(sz == n){
            head = head.next;
            return;
        }

        int i = 0;
        int iToFindN = sz - n;
        Node prev = head ;
        while(i < iToFindN - 1){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    public static void main(String[] args) {
        
        F_DeleteFromNthNode l1 = new F_DeleteFromNthNode();

         l1.addFirst(50);
        l1.addFirst(40);
        l1.addFirst(30);
        l1.addFirst(20);
        l1.addFirst(10);

        l1.DeleteFromNthNode(3);
        System.out.println("After Deleting Nth Node : ");
        printlist();
    }
}
