import java.util.Scanner;

public class HeapSort {

    // Function to heapify a subtree rooted with node i
    public void heapify(int arr[], int n, int i) {
        int largest = i;          // Initialize largest as root
        int left = 2 * i + 1;     // Left child
        int right = 2 * i + 2;    // Right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Main function to perform heap sort
    public void sort(int arr[]) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract elements from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Function to print the array
    public void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HeapSort ob = new HeapSort();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        ob.printArray(arr);

        ob.sort(arr);

        System.out.println("Sorted array (Heap Sort):");
        ob.printArray(arr);

        sc.close();
    }
}
// Enter number of elements: 6
// Enter 6 integers:
// 12 3 45 7 1 19
// Original array:
// 12 3 45 7 1 19 
// Sorted array (Heap Sort):
// 1 3 7 12 19 45