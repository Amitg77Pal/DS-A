// import java.util.*;

// public class Divisors {

    //Brute-force approach
    // public static List<Integer> findDivisorsBruteForce(int n) {
        // List<Integer> divisors = new ArrayList<>();
        // for (int i = 1; i <= n; i++) {
            // if (n % i == 0) {
                // divisors.add(i);
            // }
        // }
        // return divisors;
    // }

    //Optimized approach
    // public static List<Integer> findDivisorsOptimized(int n) {
        // List<Integer> divisors = new ArrayList<>();
        // for (int i = 1; i <= Math.sqrt(n); i++) {
            // if (n % i == 0) {
                // divisors.add(i);
                // if (i != n / i) { // Avoid adding the square root twice if it's a perfect square
                    // divisors.add(n / i);
                // }
            // }
        // }
        // Collections.sort(divisors); // To maintain sorted order
        // return divisors;
    // }

    // public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter a number: ");
        // int n = scanner.nextInt();

        // System.out.println("Divisors using Brute-force: " + findDivisorsBruteForce(n));
        // System.out.println("Divisors using Optimized approach: " + findDivisorsOptimized(n));

        // scanner.close();
    // }
// }

// /*
// Time and Space Complexity:

// 1. Brute-force Approach:
   // - Time Complexity: O(n) (We iterate through all numbers from 1 to n).
   // - Space Complexity: O(d), where d is the number of divisors (for storing the result).

// 2. Optimized Approach:
   // - Time Complexity: O(\u221an) (We iterate only up to the square root of n).
   // - Space Complexity: O(d), where d is the number of divisors (for storing the result).
// */

import java.util.Scanner;

public class Divisors {

    // Brute-force method
    public static void brute_force_method(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Optimized method
    public static void optimal_method(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) { // Avoid duplicate printing for perfect squares
                    System.out.print((n / i) + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Brute-force method result:");
        brute_force_method(n);

        System.out.println("Optimized method result:");
        optimal_method(n);

        sc.close();
    }
}
