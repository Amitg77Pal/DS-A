import java.util.Scanner;

public class MoveZerosToEnd {
    public static void moveZerosToEnd(int[] arr) {
        int low = 0, high = 0;
        int n = arr.length;

        while (high < n) {
            if (arr[high] != 0) {
                // Swap only if necessary
                if (low != high) {
                    int temp = arr[low];
                    arr[low] = arr[high];
                    arr[high] = temp;
                }
                low++; // Move the non-zero index
            }
            high++; // Move the high pointer
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Function call
        moveZerosToEnd(arr);

        // Output the modified array
        System.out.println("Array after moving zeros to end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close(); // Close Scanner
    }
}

// ✅ Time Complexity: O(n)
// ✅ Space Complexity: O(1) (in-place)