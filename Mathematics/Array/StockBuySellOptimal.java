/*public class StockBuySellNaive {
    // Function to calculate the maximum profit
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {1, 5, 3, 8, 12}; // Example input
        System.out.println("Maximum Profit: " + maxProfit(prices));
    }
}*/







//A more optimized approach using Kadane's Algorithm or Greedy Strategy (O(n))? 

import java.util.Scanner;

public class StockBuySellOptimal {
    // Function to calculate the maximum profit in O(n)
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE; // Track the minimum price so far
        int maxProfit = 0; // Track the maximum profit

        for (int i = 0; i < prices.length; i++) {
            // Update minPrice if a lower price is found
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Calculate profit and update maxProfit if we get a better profit
            else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of days
        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();

        // Create an array for stock prices
        int[] prices = new int[n];

        // Get the prices from the user
        System.out.println("Enter the stock prices: ");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        // Calculate and print the maximum profit
        System.out.println("Maximum Profit: " + maxProfit(prices));

        // Close the scanner
        scanner.close();
    }
}


// Enter the number of days: 5
// Enter the stock prices:
// 1 5 3 8 12
// Maximum Profit: 11

 // Best Case (Array Sorted in Increasing Order) → O(n)
// 🔹 Worst Case (Array Sorted in Decreasing Order) → O(n)
// 🔹 Average Case Complexity → O(n

// Final Complexity Summary
// ✅ Time Complexity: O(n) (Single pass)
// ✅ Space Complexity: O(1) (Only a few variables)