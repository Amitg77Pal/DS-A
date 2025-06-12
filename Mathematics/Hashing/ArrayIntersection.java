// import java.util.Scanner;

// public class ArrayIntersection {
    // public static void intersection(int a[], int m, int b[], int n) {
        // for (int i = 0; i < m; i++) {
            // boolean flag = false;
            // for (int j = 0; j < n; j++) {
                // if (a[i] == b[j]) {
                    // flag = true;
                    // break;
                // }
            // }
            // if (flag) {
                // System.out.print(a[i] + " ");
            // }
        // }
        // System.out.println();
    // }

    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        ////Input for first array
        // System.out.print("Enter size of first array: ");
        // int m = sc.nextInt();
        // int[] a = new int[m];
        // System.out.println("Enter elements of first array:");
        // for (int i = 0; i < m; i++) {
            // a[i] = sc.nextInt();
        // }

        ////Input for second array
        // System.out.print("Enter size of second array: ");
        // int n = sc.nextInt();
        // int[] b = new int[n];
        // System.out.println("Enter elements of second array:");
        // for (int i = 0; i < n; i++) {
            // b[i] = sc.nextInt();
        // }

        ////Find intersection
        // System.out.println("Intersection of the two arrays:");
        // intersection(a, m, b, n);

        // sc.close();
    // }
// }

// }
import java.util.HashSet;
import java.util.Scanner;

public class ArrayIntersection {
    public static void intersection(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> printed = new HashSet<>();

        // Store elements of the first array in the HashSet
        for (int num : a) {
            set.add(num);
        }

        // Check if elements of the second array exist in the HashSet
        for (int num : b) {
            if (set.contains(num) && !printed.contains(num)) {
                System.out.print(num + " ");
                printed.add(num); // Avoid duplicate printing
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first array
        System.out.print("Enter size of first array: ");
        int m = sc.nextInt();
        int[] a = new int[m];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        // Input for second array
        System.out.print("Enter size of second array: ");
        int n = sc.nextInt();
        int[] b = new int[n];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // Find intersection
        System.out.println("Intersection of the two arrays:");
        intersection(a, b);

        sc.close();
    }
}
