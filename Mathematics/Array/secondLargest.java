import java.util.Scanner;

public class secondLargest {
    
    // Function to find the second largest element in the array
    public static int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the array
        for (int n : arr) {
            if (n > largest) {
                secondLargest = largest; // Update second largest
                largest = n; // Update largest
            } else if (n > secondLargest && n <largest) {
                secondLargest = n; // Update second largest if it's smaller than largest but greater than current second largest
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest; // Return -1 if no second largest element exists
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for array size
        System.out.println("Enter the total number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Taking array input from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Finding the second largest element
        int result = getSecondLargest(arr);
        if (result == -1) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest element is: " + result);
        }

        sc.close();
    }
}


// Time Complexity	O(n)
// Space Complexity	O(1)