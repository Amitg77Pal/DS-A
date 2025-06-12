import java.util.Scanner;

public class FrequencyInSortedArray {
    public static void countFrequencies(int[] arr) {
        int n = arr.length;
        int count = 1; // Initialize frequency count

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++; // Increase count if same as previous
            } else {
                System.out.println(arr[i - 1] + " -> " + count); // Print frequency
                count = 1; // Reset count for new number
            }
        }

        // Print frequency for the last element
        System.out.println(arr[n - 1] + " -> " + count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the sorted array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the sorted array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Frequencies of elements:");
        countFrequencies(arr);

        scanner.close();
    }
}
