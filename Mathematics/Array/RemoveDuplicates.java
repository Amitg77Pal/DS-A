import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0; // Edge case: Empty array

        int i = 0; // Pointer for the last unique element

        for (int j = 1; j < arr.length; j++) { 
            if (arr[j] != arr[i]) { 
                i++; // Move the pointer for unique elements
                arr[i] = arr[j]; // Update the next unique position
            }
        }
        return i + 1; // The length of the array with unique elements
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take user input for array elements
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Remove duplicates and get new length
        int newLength = removeDuplicates(arr);
		
		
		 System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
		//instance of above this we can use this one also but

		// Complexity Type	Value
		// Time Complexity	O(n)
		// Space Complexity	O(n) (due to Arrays.copyOfRange())
				// Create a subarray containing only unique elements
				// int[] uniqueArr = Arrays.copyOfRange(arr, 0, newLength);

				//Print the unique elements using a for-each loop
				// System.out.println("Array after removing duplicates:");
				// for (int num : uniqueArr) {
					// System.out.print(num + " ");
				// }

				// sc.close();
     }
	 
	 
}



// Complexity Type	Value
// Time Complexity	O(n)
// Space Complexity	O(1)