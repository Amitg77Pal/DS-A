import java.util.*;

public class DistinctElementsInWindow {
    public static List<Integer> countDistinctElements(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        if (arr.length < k) {
            System.out.println("Invalid window size! It must be ≤ array size.");
            return result;
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        int distinctCount = 0;

        // Initialize the first window
        for (int i = 0; i < k; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
            if (freqMap.get(arr[i]) == 1) distinctCount++;
        }
        result.add(distinctCount);

        // Sliding window process
        for (int i = k; i < arr.length; i++) {
            // Remove the leftmost element
            int left = arr[i - k];
            freqMap.put(left, freqMap.get(left) - 1);
            if (freqMap.get(left) == 0) {
                distinctCount--;
                freqMap.remove(left);
            }

            // Add the new element
            int right = arr[i];
            freqMap.put(right, freqMap.getOrDefault(right, 0) + 1);
            if (freqMap.get(right) == 1) distinctCount++;

            result.add(distinctCount);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Array size must be positive!");
            return;
        }

        int[] arr = new int[n];

        // Taking array elements input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Taking window size input
        System.out.print("Enter the window size (k): ");
        int k = scanner.nextInt();

        // Validate window size
        if (k > n || k <= 0) {
            System.out.println("Window size must be between 1 and array size!");
        } else {
            System.out.println("Distinct element counts in each window:");
            List<Integer> results = countDistinctElements(arr, k);
            System.out.println(results);
        }

        scanner.close();
    }
}


// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// public class CountDistinctElements {

    // public static void countDistinctElements(int[] arr, int k) {
        // if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            // System.out.println("Invalid input.");
            // return;
        // }

        // Map<Integer, Integer> map = new HashMap<>();

        ////Process the first window of size k
        // for (int i = 0; i < k; i++) {
            // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }
        // System.out.print(map.size() + " "); // Print the count for the first window

       //// Process the remaining windows
        // for (int i = k; i < arr.length; i++) {
           //// Remove the leftmost element of the previous window
            // if (map.get(arr[i - k]) == 1) {
                // map.remove(arr[i - k]);
            // } else {
                // map.put(arr[i - k], map.get(arr[i - k]) - 1);
            // }

           //// Add the new element of the current window
            // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            // System.out.print(map.size() + " "); // Print the count for the current window
        // }
        // System.out.println(); // Add a newline at the end
    // }

    // public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the size of the array: ");
        // int size = scanner.nextInt();

        // int[] arr = new int[size];

        // System.out.println("Enter the elements of the array:");
        // for (int i = 0; i < size; i++) {
            // arr[i] = scanner.nextInt();
        // }

        // System.out.print("Enter the window size (k): ");
        // int k = scanner.nextInt();

        // countDistinctElements(arr, k);

        // scanner.close();
    // }
// }