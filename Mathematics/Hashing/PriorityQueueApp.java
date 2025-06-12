import java.util.Scanner;

// Node class representing each element in the priority queue
class Node {
    int data;
    int priority;
    Node next;

    public Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}

// Priority Queue class using linked list
class PriorityQueue {
    private Node head;

    // Insert node based on priority (lower number = higher priority)
    public void insert(int data, int priority) {
        Node newNode = new Node(data, priority);
        if (head == null || priority < head.priority) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null && temp.next.priority <= priority) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        System.out.println("Inserted: " + data + " with priority: " + priority);
    }

    // Delete node by value
    public void delete(int data) {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println("Deleted: " + data);
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Element not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Deleted: " + data);
        }
    }

    // Search node by value
    public void search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Found: " + data + " with priority: " + temp.priority);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Element not found.");
    }

    // Display all elements in the priority queue
    public void display() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node temp = head;
        System.out.println("Priority Queue:");
        while (temp != null) {
            System.out.println("Data: " + temp.data + ", Priority: " + temp.priority);
            temp = temp.next;
        }
    }
}

// Main class with menu
public class PriorityQueueApp {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        Scanner sc = new Scanner(System.in);
        int choice, data, priority;

        do {
            System.out.println("\n--- Priority Queue Menu ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    System.out.print("Enter priority (lower number = higher priority): ");
                    priority = sc.nextInt();
                    pq.insert(data, priority);
                    break;

                case 2:
                    System.out.print("Enter data to delete: ");
                    data = sc.nextInt();
                    pq.delete(data);
                    break;

                case 3:
                    System.out.print("Enter data to search: ");
                    data = sc.nextInt();
                    pq.search(data);
                    break;

                case 4:
                    pq.display();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
