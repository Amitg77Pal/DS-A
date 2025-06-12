import java.util.Scanner;

public class PowerOfTwo {

    // Brute-force approach
    public static boolean isPowerOfTwoBruteForce(int n) {
        if (n <= 0) return false; // Negative numbers and 0 are not powers of 2

        // Convert the number to binary
        String binary = Integer.toBinaryString(n);

        // Count the number of '1's in the binary representation
        int countOfOnes = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') {
                countOfOnes++;
            }
        }

        // A power of 2 will have exactly one '1' in its binary representation
        return countOfOnes == 1;
    }

    // Optimal approach using bitwise operations
    public static boolean isPowerOfTwoOptimal(int n) {
        if (n <= 0) return false; // Negative numbers and 0 are not powers of 2

        // A power of 2 has exactly one bit set, so n & (n - 1) should be 0
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        // Brute-force result
        boolean bruteForceResult = isPowerOfTwoBruteForce(n);
        System.out.println("\nUsing Brute-force:");
        System.out.println("Is " + n + " a power of 2? " + bruteForceResult);

        // Optimal result
        boolean optimalResult = isPowerOfTwoOptimal(n);
        System.out.println("\nUsing Optimal approach:");
        System.out.println("Is " + n + " a power of 2? " + optimalResult);

        scanner.close();
    }
}

/*Brute-force:Time Complexity:-O(logn)
			:Space Complexity:-O(logn)
Optimal:Time Complexity:-O(1)
		:Space Complexity:-O(1)*/