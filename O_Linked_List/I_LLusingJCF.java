package O_Linked_List;

import java.util.LinkedList;

public class I_LLusingJCF {
    public static void main(String[] args) {

    // CREATE
    LinkedList<String> ll = new LinkedList<>();

    // ADD
    ll.addLast("Yash");
    ll.addLast("Sahil");
    ll.addFirst("Kartik");
    ll.addFirst("Smit");

    System.out.print("Linked List : " + ll);
    System.out.println();

    // REMOVE
    ll.removeFirst();
    ll.removeLast();

    System.out.println("Linked List : " + ll);


    }
}
