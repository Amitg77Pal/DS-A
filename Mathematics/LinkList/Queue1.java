// import java.util.*;

// public class Queue1 {
//     static class Queue {
//         int arr[];
//         int size;
//         int rear = -1;

//         Queue(int n) {
//             arr = new int[n];
//             this.size = n;
//         }

//         public boolean isEmpty() {
//             return rear == -1;
//         }

//         // Enqueue
//         public void add(int data) {
//             if (rear == size - 1) {
//                 System.out.println("Queue is full");
//                 return;
//             }
//             rear++;
//             arr[rear] = data;
//         }

//         // Dequeue
//         public int remove() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             int front = arr[0];
//             for (int i = 0; i < rear; i++) {
//                 arr[i] = arr[i + 1];
//             }
//             rear--;
//             return front;
//         }

//         // Peek
//         public int peek() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return arr[0];
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
        
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// import java.util.*;

// public class Queue1 {
//     static class Queue {
//         int[] arr;
//         int size;
//         int rear;
//         int front;

//         Queue(int n) {
//             arr = new int[n];
//             this.size = n;
//             this.rear = -1;
//             this.front = -1;
//         }

//         public boolean isEmpty() {
//             return rear == -1 && front == -1;
//         }

//         public boolean isFull() {
//             return (rear + 1) % size == front;
//         }

//         public void add(int data) {
//             if (isFull()) {
//                 System.out.println("Queue is full");
//                 return;
//             }

//             // First element
//             if (isEmpty()) {
//                 front = rear = 0;
//             } else {
//                 rear = (rear + 1) % size;
//             }

//             arr[rear] = data;
//         }

//         public int remove() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }

//             int result = arr[front];

//             // Single element case
//             if (front == rear) {
//                 front = rear = -1;
//             } else {
//                 front = (front + 1) % size;
//             }

//             return result;
//         }

//         public int peek() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return arr[front];
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue(5); // Keeping size 5 for clarity
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5); // Queue should be full now

//         System.out.println("Removed: " + q.remove()); // Removes 1
//         q.add(6); // Adds 6 at circular position

//         System.out.println("Removed: " + q.remove()); // Removes 2
//         q.add(7); // Adds 7

//         // Print remaining elements
//         while (!q.isEmpty()) {
//             System.out.println("Peek: " + q.peek());
//             q.remove();
//         }
//     }
// }

public class Queue1{
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;

        } 

    }
    static class Queue{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null & rear==null;
        }
        //enqueue
        public static void add(int data)
        {
            if(tail==null)
            {
                tail=head=newNode;
                return;
            }
            Node newNode=new Node(data);
            tail.next=newNode;
            tail=newNode;

        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front=head.data;
            if(head==tail)
            {
                tail=null;
            }
            
            head=head.next;
            return front;
        }

    }
}