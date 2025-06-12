// import java.util.Scanner;

// public class SubarrayWithZeroSum {
    ////Function to check if a subarray with 0 sum exists
    // public static boolean hasZeroSumSubarray(int[] arr, int n) {
        // for (int i = 0; i < n; i++) {
            // int curr_sum = 0;
            // for (int j = i; j < n; j++) {
                // curr_sum += arr[j];
                // if (curr_sum == 0) {
                    // return true;
                // }
            // }
        // }
        // return false;
    // }

    ////Main function
    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of the array: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the array elements: ");
        // for (int i = 0; i < n; i++) {
            // arr[i] = sc.nextInt();
        // }

       //// Call the function and display the result
        // boolean result = hasZeroSumSubarray(arr, n);
        // if (result) {
            // System.out.println("Yes, Subarray with sum 0 exists.");
        // } else {
            // System.out.println("No, Subarray with sum 0 does not exist.");
        // }

        // sc.close();
    // }
// }


// Enter the size of the array: 6
// Enter the array elements: 
// 1 4 13 -3 -10 5
// Yes, Subarray with sum 0 exists.


// ✅ Time and Space Complexity:
// Approach	Time Complexity	Space Complexity
// Naive (Brute Force)	O(N^2)	O(1) (Constant Space)
// Optimized (HashSet)	O(N)	O(N) (HashSet Space)


import java.util.HashSet;
import java.util.Scanner;

public class SubarrayWithZeroSum {
    // Function to check if subarray with sum 0 exists
    public static boolean hasZeroSumSubarray(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int preSum = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];

            // Check if the prefix sum is 0 or already exists in HashSet
            if (preSum == 0 || set.contains(preSum)) {
                return true;
            }

            // Add the prefix sum to the HashSet
            set.add(preSum);
        }
        return false;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = hasZeroSumSubarray(arr);
        if (result) {
            System.out.println("Yes, Subarray with sum 0 exists.");
        } else {
            System.out.println("No, Subarray with sum 0 does not exist.");
        }

        sc.close();
    }
}

