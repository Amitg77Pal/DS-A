// public class Stack1 {
//     static class Node {
//         int data;
//         Node next;
//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class Stack {
//         public static Node head; // Top of the stack

//         public static boolean isEmpty() {
//             return head == null;
//         }

//         public static void push(int data) {
//             Node newNode = new Node(data);
//             if (isEmpty()) {
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//         }

//         public static int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         public static int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             return head.data;
//         }
//     }

//     public static void main(String[] args) {
//         Stack s = new Stack(); // Create an instance of Stack
//         s.push(1);
//         s.push(4);
//         s.push(3);
//         s.push(4);
//         while(!s.isEmpty()) {
//             System.out.println("Popped: " + s.peek());
//             s.pop();
//         }

//     }
// }

// import java.util.*;
// public class Stack1{
//     static class Stack{
//         static ArrayList<Integer> list=new ArrayList<>();
//         public static boolean isEmpty()
//         {
//             return list.size()==0;
//         }
//         public static void push(int data){
//             list.add(data);
//         }
//         public static int pop()
//         {
//             if(isEmpty())
//             {
//                 return -1;
//             }
//             int top=list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;
//         }
//         public static int peek()
//         {
//             if(isEmpty())
//             {
//                 return -1;
//             }
//             int top=list.get(list.size()-1);
//             return top;
//         }

//     }
//     public static void main(String[] args) {
//         Stack s=new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         while(!s.isEmpty())
//         {
//             System.out.println("poped"+s.peek());
//             s.pop();

//         }
//     }
// }


import java.util.*;
public class Stack1{
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);

        stack.push(3);
        stack.push(4);
        while(!stack.isEmpty())
        {
            System.out.println("poped"+stack.peek());
            stack.pop();
        }
    }
}