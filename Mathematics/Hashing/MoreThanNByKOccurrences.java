import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MoreThanNByKOccurrences {
    public static void printElements(int[] arr, int k) {
        int n = arr.length;
        if (k <= 0) {
            System.out.println("Invalid value of k.");
            return;
        }

        // Step 1: Store frequencies in a HashMap
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Print elements occurring more than n/k times
        int threshold = n / k;
        boolean found = false;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > threshold) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No elements appear more than " + threshold + " times.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        printElements(arr, k);
        
        scanner.close();
    }
}
