import java.util.Scanner;

public class SelectionSort {

    public static void selection(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i; //Initialize min outside the inner loop

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j; // Update min index if smaller element found
                }
            }

            // Swap the found minimum with the first element of the unsorted part
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selection(arr);

        System.out.println("Sorted elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
