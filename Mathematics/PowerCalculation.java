// Brute-force method
public class PowerCalculation {
    // Brute-force method
    public static double bruteForcePow(double x, int n) {
        double result = 1.0;
        int power = Math.abs(n);
        for (int i = 0; i < power; i++) {
            result *= x;
        }
        return n < 0 ? 1 / result : result;
    }

    // Optimized method using Exponentiation by Squaring
    public static double optimizedPow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double result = 1.0;
        while (n > 0) {
            if ((n & 1) == 1) { // If n is odd
                result *= x;
            }
            x *= x; // Square the base
            n >>= 1; // Divide n by 2
        }
        return result;
    }

    // Main function
    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;

        // Brute-force calculation
        double bruteForceResult = bruteForcePow(x, n);
        System.out.println("Brute-force result: " + bruteForceResult);

        // Optimized calculation
        double optimizedResult = optimizedPow(x, n);
        System.out.println("Optimized result: " + optimizedResult);
    }
}
/*Brute-Force Method

Time Complexity: O(n), where n is the exponent.
Space Complexity: O(1), no extra space is used.


Optimized Method (Exponentiation by Squaring)


Time Complexity: O(logn), as n is halved in every step.
Space Complexity: O(1), iterative implementation avoids recursion stack*/