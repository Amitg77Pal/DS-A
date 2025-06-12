import java.util.Scanner;

public class TrappingRainwaterOptimal {
    // Function to calculate trapped rainwater in O(n) time using for loop
    public static int trapWater(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int leftMax = 0, rightMax = 0;
        int totalWater = 0;

        // Use for loop instead of while
        for (int left = 0, right = n - 1; left < right;) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // Update left max
                } else {
                    totalWater += leftMax - height[left]; // Add trapped water
                }
                left++; // Move left pointer
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right]; // Update right max
                } else {
                    totalWater += rightMax - height[right]; // Add trapped water
                }
                right--; // Move right pointer
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] height = new int[n];
        System.out.println("Enter the heights:");
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        System.out.println("Total Trapped Water: " + trapWater(height));

        scanner.close();
    }
}
