import java.util.Scanner;

public class JosephusProblem {
    // Recursive function to find the safe position
    public static int josephus(int n, int k) {
        // Base case: when only one person is left
        if (n == 1) {
            return 0;
        }
        // Recursive step: Adjusting the index for the current size
        return (josephus(n - 1, k) + k) % n;
    }
	
	
	////Second Function (1-based Indexing)
	// public int josephus(int n, int k) {
		Base case: only one person remains
		// if (n == 1) {
			// return 1;
		// } else {
			Recursive step: compute the safe position for (n-1) persons
			// return (josephus(n - 1, k) + k - 1) % n + 1;
		// }
	// }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for N and K
        System.out.print("Enter the number of people (N): ");
        int n = scanner.nextInt();

        System.out.print("Enter the step count (K): ");
        int k = scanner.nextInt();

        // Josephus is 0-based index, converting to 1-based
        int safePosition = josephus(n, k) + 1;
        System.out.println("The safe position is: " + safePosition);

        scanner.close();
    }
}

// Enter the number of people (N): 5
// Enter the step count (K): 2
// The safe position is: 3

//T(n)=T(n−1)+O(1)
// Time Complexity	O(N) (Linear)
// Space Complexity	O(N) (Recursive Stack)
