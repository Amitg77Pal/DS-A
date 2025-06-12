import java.util.HashMap;
import java.util.Scanner;

public class OddAppearingNumbers {

    // Brute-force approach
    public static int[] findOddNumbersBruteForce(int[] arr) {
        // Create a map to store occurrences of each number
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the map with counts of each number
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the numbers that occur an odd number of times
        int[] result = new int[frequencyMap.size()];
        int index = 0;
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) % 2 != 0) {
                result[index++] = num;
            }
        }

        // Resize the result array to contain only the odd appearing numbers
        int[] oddNumbers = new int[index];
        System.arraycopy(result, 0, oddNumbers, 0, index);
        return oddNumbers;
    }

    // Optimal approach using XOR (works only when there are exactly two odd appearing numbers)
    public static int[] findTwoOddNumbersOptimal(int[] arr) {
        int xor = 0;

        // XOR all elements to get xor of the two odd-appearing numbers
        for (int num : arr) {
            xor ^= num;
        }

        // Find the rightmost set bit in xor
        int rightmostSetBit = xor & -xor;

        // Divide the array into two groups based on the rightmost set bit
        int odd1 = 0, odd2 = 0;
        for (int num : arr) {
            if ((num & rightmostSetBit) != 0) {
                odd1 ^= num; // XOR group 1
            } else {
                odd2 ^= num; // XOR group 2
            }
        }

        return new int[]{odd1, odd2};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Brute-force result
        int[] bruteForceResult = findOddNumbersBruteForce(arr);
        System.out.println("Using Brute-force approach:");
        System.out.print("The odd appearing numbers are: ");
        for (int num : bruteForceResult) {
            System.out.print(num + " ");
        }

        // Optimal result (only if there are exactly two odd appearing numbers)
        if (bruteForceResult.length == 2) {
            int[] optimalResult = findTwoOddNumbersOptimal(arr);
            System.out.println("\n\nUsing Optimal (XOR) approach:");
            System.out.println("The two odd appearing numbers are: " + optimalResult[0] + " and " + optimalResult[1]);
        } else {
            System.out.println("\n\nOptimal approach is only applicable when there are exactly two odd appearing numbers.");
        }

        scanner.close();
    }
}

/*Brute-force:Time Complexity:-O(n)
			:Space Complexity:-O(n)
Optimal:Time Complexity:-O(n)
		:Space Complexity:-O(1)*/

/*		
import java.util.HashMap;

public class OddOccurringNumber {

    // Brute-force approach
    public static int findOddOccurringNumberBruteForce(int[] arr) {
        // Create a map to store occurrences of each number
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the map with counts of each number
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find and return the number that occurs an odd number of times
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) % 2 != 0) {
                return num;
            }
        }

        // Return -1 if no such number is found
        return -1;
    }

    // Optimal approach using XOR
    public static int findOddOccurringNumberOptimal(int[] arr) {
        int result = 0;

        // XOR all the elements
        for (int num : arr) {
            result ^= num;  // XOR-ing each number
        }

        // The result will be the number that occurs an odd number of times
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 4, 4, 4, 5, 5};

        // Brute-force result
        int bruteForceResult = findOddOccurringNumberBruteForce(arr);
        System.out.println("Using Brute-force approach:");
        System.out.println("The odd occurring number is: " + bruteForceResult);

        // Optimal result
        int optimalResult = findOddOccurringNumberOptimal(arr);
        System.out.println("\nUsing Optimal (XOR) approach:");
        System.out.println("The odd occurring number is: " + optimalResult);
    }
}
*/