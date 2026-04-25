package P1_Queue;

import java.util.Queue;

public class implementUsingJCF {
    
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Dequeue
        System.out.println("Dequeued element: " + queue.remove());

        // Peek
        System.out.println("Front element: " + queue.peek());
    }
}
