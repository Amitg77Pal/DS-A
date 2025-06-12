import java.util.Scanner;

public class KthBitCheck {
    // Brute-force approach
    public static String checkKthBitBruteForce(int n, int k) {
        // Convert to binary and check the k-th bit
        String binary = Integer.toBinaryString(n);
        int bitIndex = binary.length() - k; // k-th bit from the right
        if (bitIndex >= 0 && binary.charAt(bitIndex) == '1') {//In binary representation, '1' means the bit is set, while '0' means it is not set.
            return "Yes";
        } else {
            return "No";
        }
    }

    // Optimal approach using bitwise operations
    public static String checkKthBitOptimal(int n, int k) {
        // Shift 1 left (k-1) times and perform AND
		int x=(1 << (k - 1));
        if ((n & x) != 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the number (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the bit position to check (k): ");
        int k = scanner.nextInt();

        // Brute-force approach result
        String bruteForceResult = checkKthBitBruteForce(n, k);
        System.out.println("\nUsing Brute-force:");
        System.out.println("Is the " + k + "-th bit set in " + n + "? " + bruteForceResult);

        // Optimal approach result
        String optimalResult = checkKthBitOptimal(n, k);
        System.out.println("\nUsing Optimal approach:");
        System.out.println("Is the " + k + "-th bit set in " + n + "? " + optimalResult);

        scanner.close();
    }
}


/*Brute-force:Time Complexity:-O(logn)
			:Space Complexity:-O(logn)
Optimal:Time Complexity:-O(1)
		:Space Complexity:-O(1)*/