import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PowerSetBitwise {

    // Function to generate powerset using bitwise operators
    public static List<List<Integer>> generatePowerSet(int[] arr) {
        List<List<Integer>> powerSet = new ArrayList<>();

        int n = arr.length;
        int totalSubsets = 1 << n; // Total subsets = 2^n

        // Generate each subset
        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> subset = new ArrayList<>();

            // Check each bit of i
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { // If j-th bit is set
                    subset.add(arr[j]);
                }
            }

            powerSet.add(subset);
        }

        return powerSet;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the array elements
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Generate the powerset
        List<List<Integer>> powerSet = generatePowerSet(arr);

        // Output the powerset
        System.out.println("Powerset:");
        System.out.println(powerSet);

        scanner.close();
    }
}
/*
Time and Space Complexity
Time Complexity:

The total number of subsets for an array of size n is o(2)^n
𝑛
2 

 .
For each subset, we check n bits to decide whether to include each element, making the time complexity: o(n.2^n)

Space Complexity:

The space required to store the powerset is proportional to the number of subsets, and each subset can contain up to n elements:o(n.2^n)

Additional space for intermediate variables is :O(1), so overall space complexity is dominated by the storage of the powerset.*/