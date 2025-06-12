// import java.util.Scanner;

// public class FrequencyofElement {
    // public static void findFrequencies(int[] arr) {
        // int n = arr.length;
        // boolean[] visited = new boolean[n];

        // for (int i = 0; i < n; i++) {
            // if (visited[i]) {
                // continue;
            // }
            // int count = 1;
            // for (int j = i + 1; j < n; j++) {
                // if (arr[i] == arr[j]) {
                    // count++;
                    // visited[j] = true;
                // }
            // }
           // // Using println with string concatenation
            // System.out.println(arr[i] + " -> " + count);
			
			////Print the frequency of the element
            ////System.out.printf("%d -> %d%n", arr[i], count);
        // }
    // }

    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of elements: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];

        // System.out.println("Enter the elements:");
        // for (int i = 0; i < n; i++) {
            // arr[i] = sc.nextInt();
        // }

        // findFrequencies(arr);

        // sc.close();
    // }
// }



// Approach	Time Complexity (Worst Case)	Time Complexity (Best Case)	Space Complexity
// Naive Approach (Nested Loops)	O(n²) (each element compared with all others)	O(n²) (even if elements are the same, inner loop runs)	O(n) (for visited[] array)
// Optimized Approach (Using HashMap)	O(n) (single pass to count, another to print)	O(n) (same complexity in best case)	O(n) (storing frequencies in HashMap)


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class FrequencyCalculator {
    // Function to calculate and print frequency of elements
    public static void findFrequencies(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Display the frequency of each element
        System.out.println("Element Frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking user input for array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the function from the separate class
        FrequencyCalculator.findFrequencies(arr);

        sc.close();
    }
}
