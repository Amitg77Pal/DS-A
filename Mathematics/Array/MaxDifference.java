import java.util.Scanner;

public class MaxDifference {
    public static int maxDifference(int[] arr) {
        int minElement = arr[0]; 
        int maxDiff = Integer.MIN_VALUE; 

        for (int i = 1; i < arr.length; i++) {
            maxDiff = Math.max(maxDiff, arr[i] - minElement);
            minElement = Math.min(minElement, arr[i]); 
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = maxDifference(arr);
        System.out.println("Maximum Difference: " + result);

        scanner.close();
    }
}

// Time Complexity	O(n)
// Space Complexity O(1) 