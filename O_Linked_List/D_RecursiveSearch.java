package O_Linked_List;

public class D_RecursiveSearch {

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

    // Recursive Search

    public static int helper(Node head , int key ){

        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int index = helper(head.next, key);

            if(index == -1){
                return -1;
            }
            
            return index+1;
    }

    public static int RecursiveSearch(int key){
       return helper(head, key);
    }
    public static void main(String[] args) {

        D_RecursiveSearch l1 = new D_RecursiveSearch();
        
        l1.addFirst(50);
        l1.addFirst(40);
        l1.addFirst(30);
        l1.addFirst(20);
        l1.addFirst(10);

        printlist();

        System.out.println("Find 30 : " + l1.RecursiveSearch(30));
        
    }
}