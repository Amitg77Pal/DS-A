import java.util.Scanner;

public class MaxHeap1 {
    private int[] heap;
    private int size;
    private int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[this.maxSize + 1];
        heap[0] = Integer.MAX_VALUE; // Sentinel for easy comparison
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return 2 * pos;
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos) {
        return (pos > size / 2) && (pos <= size);
    }

    private void swap(int fpos, int spos) {
        int tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
    }

    private void maxHeapify(int pos) {
        if (isLeaf(pos)) return;

        int left = leftChild(pos);
        int right = rightChild(pos);
        int largest = pos;

        if (left <= size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right <= size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != pos) {
            swap(pos, largest);
            maxHeapify(largest);
        }
    }

    public void insert(int element) {
        if (size >= maxSize) {
            System.out.println("Heap is full!");
            return;
        }
        heap[++size] = element;
        int current = size;

        while (heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int delete() {
        if (size == 0) {
            System.out.println("Heap is empty!");
            return -1;
        }
        int popped = heap[1];
        heap[1] = heap[size--];
        maxHeapify(1);
        return popped;
    }

    public int peek() {
        if (size == 0) {
            System.out.println("Heap is empty!");
            return -1;
        }
        return heap[1];
    }

    public boolean search(int value) {
        for (int i = 1; i <= size; i++) {
            if (heap[i] == value) return true;
        }
        return false;
    }

    public void printHeap() {
        System.out.print("Heap array: ");
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxHeap maxHeap = new MaxHeap(100);

        while (true) {
            System.out.println("\n--- Max-Heap Menu ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete Max");
            System.out.println("3. Search");
            System.out.println("4. Peek (Max Element)");
            System.out.println("5. Display Heap");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    maxHeap.insert(val);
                    break;
                case 2:
                    int removed = maxHeap.delete();
                    if (removed != -1)
                        System.out.println("Deleted max: " + removed);
                    break;
                case 3:
                    System.out.print("Enter value to search: ");
                    int search = sc.nextInt();
                    System.out.println(maxHeap.search(search) ? "Found" : "Not Found");
                    break;
                case 4:
                    int max = maxHeap.peek();
                    if (max != -1)
                        System.out.println("Max element is: " + max);
                    break;
                case 5:
                    maxHeap.printHeap();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}
