

// import java.util.Scanner;
// import java.util.ArrayList;

// public class LeadersInArray {

    Naive solution to find leaders in an array
    // public static ArrayList<Integer> findLeadersNaive(int[] arr) {
        // ArrayList<Integer> leaders = new ArrayList<>();
        // int n = arr.length;
        
        // for (int i = 0; i < n; i++) {
            // boolean isLeader = true;
            // for (int j = i + 1; j < n; j++) {
                // if (arr[i] <= arr[j]) {
                    // isLeader = false;
                    // break;
                // }
            // }
            // if (isLeader) {
                // leaders.add(arr[i]);
            // }
        // }
        
        // return leaders;
    // }

    // public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        Take array input from user
        // System.out.println("Enter the number of elements in the array:");
        // int n = scanner.nextInt();
        
        // int[] arr = new int[n];
        
        // System.out.println("Enter the elements of the array:");
        // for (int i = 0; i < n; i++) {
            // arr[i] = scanner.nextInt();
        // }
        
        // ArrayList<Integer> leaders = findLeadersNaive(arr);
        
        // System.out.println("Leaders in the array (Naive Solution):");
        // for (int leader : leaders) {
            // System.out.print(leader + " ");
        // }
        
        // scanner.close();
    // }
// }


import java.util.Scanner;
import java.util.ArrayList;

public class LeadersInArray {

    // Optimal solution to find leaders in an array
    public static ArrayList<Integer> findLeadersOptimal(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        
        // Initialize the rightmost element as the first leader
        int maxRight = arr[n - 1];
        leaders.add(maxRight);
        
        // Traverse the array from second last element to the first
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                leaders.add(arr[i]);
            }
        }
        
        // Reverse the leaders list to maintain the correct order
        // since we traverse the array from right to left
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = leaders.size() - 1; i >= 0; i--) {
            result.add(leaders.get(i));
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take array input from user
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        ArrayList<Integer> leaders = findLeadersOptimal(arr);
        
        System.out.println("Leaders in the array (Optimal Solution):");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
        
        scanner.close();
    }
}



// Approach	Time Complexity	Space Complexity	Notes
// Naive Solution	O(n^2)	O(n)	Simpler but inefficient for large arrays.
// Optimal Solution	O(n)	O(n)	More efficient as it only requires one traversal.