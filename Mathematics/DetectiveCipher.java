import java.util.Scanner;

public class DetectiveCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input size
		System.out.println("Enter the input size");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        
        // Read sequence
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        // Compute GCD of alternating non-prime numbers
        int result = findGCDOfAlternatingNonPrimes(arr);
		
        System.out.println(result);
    }

    // Function to find the GCD of alternating non-prime numbers
    public static int findGCDOfAlternatingNonPrimes(int[] arr) {
        int gcd = 0;
        int count = 0;  // Count of non-prime numbers at alternating indices

        for (int i = 0; i < arr.length; i += 2) { // Take only alternating indices (0, 2, 4, ...)
            if (!isPrime(arr[i])) { // Consider only non-prime numbers
                count++; // Increment count of non-prime numbers found
                if (count == 1) { // First non-prime initializes GCD
                    gcd = arr[i];
                } else { // Compute GCD with the next non-prime
                    gcd = computeGCD(gcd, arr[i]);
                }
            }
        }

        return count > 1 ? gcd : 0; // If fewer than 2 non-primes found, return 0
    }

    // Function to compute GCD using Euclidean Algorithm
    public static int computeGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
