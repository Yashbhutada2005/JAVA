package O_Linked_List;

public class C_IterativeSearch {
    
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

    // ITERATIVE SEARCH
    public int iterativeSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        
        C_IterativeSearch l1 = new C_IterativeSearch();

        l1.addFirst(50);
        l1.addFirst(40);
        l1.addFirst(30);
        l1.addFirst(20);
        l1.addFirst(10);

        System.out.println("Linked List : ");
        printlist();
        System.out.println();

        System.out.println("Search for 40 : " + l1.iterativeSearch(40));
    }

}
