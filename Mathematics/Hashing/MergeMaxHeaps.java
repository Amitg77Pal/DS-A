import java.util.Scanner;
import java.util.Arrays;

public class MergeMaxHeaps {

    // Function to heapify a subtree rooted with node i (max-heap)
    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Heapify the root
            heapify(arr, n, largest);
        }
    }

    // Function to build a max-heap from an array
    public static void buildMaxHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Merge two max-heaps
    public static int[] mergeHeaps(int[] heap1, int[] heap2) {
        int n1 = heap1.length;
        int n2 = heap2.length;

        int[] merged = new int[n1 + n2];

        // Copy elements
        System.arraycopy(heap1, 0, merged, 0, n1);
        System.arraycopy(heap2, 0, merged, n1, n2);

        // Build max heap from merged array
        buildMaxHeap(merged, n1 + n2);

        return merged;
    }

    // Utility to read an array from user
    public static int[] readArray(Scanner sc, int heapNumber) {
        System.out.print("Enter number of elements in Max-Heap " + heapNumber + ": ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Convert input array to max heap
        buildMaxHeap(arr, n);
        return arr;
    }

    // Print array
    public static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] heap1 = readArray(sc, 1);
        int[] heap2 = readArray(sc, 2);

        System.out.println("Max-Heap 1:");
        printArray(heap1);

        System.out.println("Max-Heap 2:");
        printArray(heap2);

        int[] mergedHeap = mergeHeaps(heap1, heap2);

        System.out.println("Merged Max-Heap:");
        printArray(mergedHeap);

        sc.close();
    }
}

Enter number of elements in Max-Heap 1: 4
Enter 4 elements:
10 20 15 30
Enter number of elements in Max-Heap 2: 3
Enter 3 elements:
40 50 35
Max-Heap 1:
30 20 15 10 
Max-Heap 2:
50 40 35 
Merged Max-Heap:
50 30 40 10 20 15 35