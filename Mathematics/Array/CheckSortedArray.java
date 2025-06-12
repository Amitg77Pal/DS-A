import java.util.Scanner;

public class CheckSortedArray {
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {  
            if (arr[i] > arr[i + 1]) {  
                return false;  
            }
        }
        return true;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Taking user input for exactly 'n' elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Ignore extra inputs (flush the buffer)
        scanner.nextLine(); 

        // Checking if the array is sorted
        if (isSorted(arr)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }

        scanner.close();
    }
}
