package P1_Queue;

 public class ImplementUsingArray {
    
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        // add
        public static void add(int data){

            // checks if queue is full
            if(rear == size -1){
                System.out.println("Queue is full");
                return;
            }

            // add element to the rear of the queue , point to next empty space
            rear = rear + 1;

            // stores the data at the rear of the queue
            arr[rear] = data ;
        }

        // remove
        public static int remove(){

            // checks if queue is empty
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

                // store first element of queue
                int front = arr[0];

                // shift all elements to the left by one position
                for(int i=0; i < rear; i++){
                    arr[i] = arr[i+1];
                }

                // decrease rear by 1
                rear = rear - 1;

                // return the removed element
                return front;
        }

        // peek
        public static int peek(){

            // checks if queue is empty
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            // return the front element 
            return arr[0];
        }
        public static void main(String[] args) {
            Queue q = new Queue(5);
            q.add(1);
            q.add(2);   
            q.add(3);
            q.add(4);
            q.add(5);

            for(int i=0; i<=rear; i++){
                System.out.print(arr[i] + " ");
            }

            System.out.println("\n" + "Element removed: " + q.remove());
            System.out.println("Element at front: " + q.peek());
            q.add(6);

            for(int i=0; i<=rear; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
