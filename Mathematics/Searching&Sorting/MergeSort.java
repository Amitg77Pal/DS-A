import java.util.Scanner;

public class MergeSort{
    
    public static void divide(int[] arr, int str, int end) {
        if (str >= end) {
            return; // base case
        }

        int mid = str + (end - str) / 2;

        divide(arr, str, mid);        // divide left half
        divide(arr, mid + 1, end);    // divide right half
        conquer(arr, str, mid, end);  // merge both halves
    }

    public static void conquer(int[] arr, int str, int mid, int end) {
        int[] merge = new int[end - str + 1];

        int idx1 = str;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merge[x++] = arr[idx1++];
            } else {
                merge[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merge[x++] = arr[idx1++];
        }

        while (idx2 <= end) {
            merge[x++] = arr[idx2++];
        }

        for (int i = 0, j = str; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
