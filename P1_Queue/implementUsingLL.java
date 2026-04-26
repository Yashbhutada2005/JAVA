package P1_Queue;

public class implementUsingLL {

    // make Node static (safe approach)
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    // Enqueue
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;   // FIXED
        rear = newNode;
    }

    // Dequeue
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return data;
    }

    // peek
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public static void main(String[] args) {
        implementUsingLL queue = new implementUsingLL();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.peek());    // 20
    }
}