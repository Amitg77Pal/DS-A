import java.util.Scanner;

public class MaximumSumSubarrayOptimal {
    // Kadane's Algorithm: O(n) time complexity
    public static int maxSubarraySum(int[] arr, int n) {
        int maxSum = arr[0]; // Maximum sum so far
        int currentSum = arr[0]; // Current sum ending at this position

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]); // Include or start new subarray
            maxSum = Math.max(maxSum, currentSum); // Update max sum
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Maximum Sum Subarray (Kadane's Algorithm): " + maxSubarraySum(arr, n));

        scanner.close();
    }
}

// Input:

// Enter the number of elements: 5
// Enter the elements: 2 -3 8 7 -2
// Output (Naive and Kadane’s will match):

// Maximum Sum Subarray: 15
// (Optimal subarray: [8, 7])



// Approach	Time Complexity	Space Complexity	Suitable For
// Naive (O(n²))	O(n²)	O(1)	Small arrays
// Kadane’s (O(n))	O(n)	O(1)	Large arrays
