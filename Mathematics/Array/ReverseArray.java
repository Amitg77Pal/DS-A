import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1; 
        
        while (left < right) { // Swap elements until the middle is reached
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];

        // Take user input for array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Reverse the array
        reverseArray(arr);

        // Print the reversed array
        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
