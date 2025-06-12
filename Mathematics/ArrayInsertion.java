import java.util.Scanner;

public class ArrayInsertion {
    public static int[] insert(int arr[], int n, int pos, int x) {
        // Create a new array with size n+1 to accommodate the new element
        int newArr[] = new int[n + 1];

        // Copy elements before the insertion position
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element at the given position
        newArr[pos] = x;

        // Copy the remaining elements after the insertion position
        for (int i = pos; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    public static void traverseArray(int arr[]) {
        System.out.println("Traversing the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Printing each element
        }
        System.out.println(); // New line after printing all elements
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Taking input for array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Taking input for position and new element
        System.out.print("Enter the position to insert (0-based index): ");
        int pos = sc.nextInt();

        // Validating position input
        if (pos < 0 || pos > n) {
            System.out.println("Invalid position! It should be between 0 and " + n);
            return;
        }

        System.out.print("Enter the element to insert: ");
        int x = sc.nextInt();

        // Calling the insertion function
        int newArr[] = insert(arr, n, pos, x);

        // Traversing and printing the updated array
        traverseArray(newArr);

        sc.close();
    }
}

//Time Complexity	O(n)
//Space Complexity	O(n) (Can be optimized to O(1) with an in-place approach)
