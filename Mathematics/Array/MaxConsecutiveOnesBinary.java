import java.util.Scanner;

public class MaxConsecutiveOnesBinary {
    // Function to find the maximum consecutive 1s in a binary array
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++; // Increase count for consecutive 1s
                maxCount = Math.max(maxCount, currentCount); // Update max count
            } else {
                currentCount = 0; // Reset count if 0 is encountered
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the binary array elements (0s and 1s):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Maximum Consecutive 1s: " + findMaxConsecutiveOnes(nums));

        scanner.close();
    }
}

// input:-
// Enter the number of elements: 6
// Enter the binary array elements: 0 1 1 0 1 0
// output:-
// Maximum Consecutive 1s: 2

// Time Complexity: O(n) (In the worst case, we still scan the entire array.)
// Space Complexity: O(1) (Uses only a few integer variables.)