import java.util.Scanner;
import java.util.HashSet;

public class ArrayUnion {
    public static void findUnion(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            set.add(num);
        }

        // Print the union
        System.out.print("Union of arrays: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println(); // Ensure proper formatting
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second array
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m]; // ✅ Fixed size issue
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        // Find and print union
        findUnion(arr1, arr2);

        sc.close();
    }
}



// “| Approach | Time Complexity | Space Complexity | Approach Type | 
// | --- | --- | --- | --- | 
// | **Naïve** | O(m⋅n)O(m \\cdot n)O(m⋅n) | O(m+n)O(m + n)O(m+n) | Brute Force | 
// | **Optimal (HashSet)** | O(m+n)O(m + n)O(m+n) | O(m+n)O(m + n)O(m+n) | Hashing |”