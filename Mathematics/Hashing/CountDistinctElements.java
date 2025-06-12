// import java.util.Scanner;

// public class CountDistinctElements {
    // public static int count(int[] arr, int n) {
        // int res = 0;
        
        // if (n == 0) {
            // return 0; // If array is empty, return 0
        // }

        // for (int i = 0; i < n; i++) {
            // boolean flag = false;
            
            // for (int j = 0; j < i; j++) { // Only check previous elements
                // if (arr[i] == arr[j]) {
                    // flag = true;
                    // break;
                // }
            // }
            
            // if (!flag) { 
                // res++;
            // }
        // }
        
        // return res; // Return count of distinct elements
    // }

    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter the size of the array: ");
        // int n = sc.nextInt();
        
        // int[] arr = new int[n];
        // System.out.println("Enter the array elements:");
        
        // for (int i = 0; i < n; i++) {
            // arr[i] = sc.nextInt();
        // }
        
        // int result = count(arr, n); // Pass both arguments
        // System.out.println("Number of distinct elements: " + result);
        
        // sc.close();
    // }
// }


// Summary:
// Operation	Time Complexity	Space Complexity
// Arrays.asList(arr)	O(n)	O(1)
// new HashSet<>(List)	O(n)	O(n)
// set.size()	O(1)	O(1)
// Total Complexity	O(n)	O(n)
// This implementation is efficient and works well for counting distinct elements in O(n) time and O(n) space. 🚀

// import java.util.Scanner;
// import java.util.Arrays;
// public class CountDistinctElements
// {
	// public static int count(int[] arr)
	// {
		// int count=1;
		// if(arr.length==0)
		// {
			// return 0;
		// }
		// Arrays.sort(arr);
		// for(int i=1;i<arr.length;i++)
		// {
			// if(arr[i]!=arr[i-1])
			// {
				// count++;
			// }
		// }
		// return count;
	// }
	 // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter the size of the array: ");
        // int n = sc.nextInt();
        
        // int[] arr = new int[n];
        // System.out.println("Enter the array elements:");
        
        // for (int i = 0; i < n; i++) {
            // arr[i] = sc.nextInt();
        // }
        
        // int result = count(arr); // Pass both arguments
        // System.out.println("Number of distinct elements: " + result);
        
        // sc.close();
    // }
// }


import java.util.Scanner;
import java.util.HashSet;
public class CountDistinctElements
{
	public static int count(int[] arr)
	{
		HashSet<Integer> hash=new HashSet<>();
		for(int num:arr)
		{
			hash.add(num);
		}
		return hash.size();
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = count(arr); // Pass both arguments
        System.out.println("Number of distinct elements: " + result);
        
        sc.close();
    }
}



// import java.util.*;

// public class CountDistinctElements {
    // public static int countDistinct(Integer[] arr) {
        // return new HashSet<>(Arrays.asList(arr)).size();
    // }

    // public static void main(String[] args) {
        // Integer[] arr = {10, 20, 10, 20, 30};
        // System.out.println("Number of distinct elements: " + countDistinct(arr));
    // }
// }




// ✅ Advantages:

// Uses Arrays.asList(arr), which makes it more concise.
// Less code, since it directly creates a HashSet from a list.
// Useful when working with predefined arrays.
// ❌ Disadvantages:

// Uses Integer[] (Wrapper class), which consumes more memory due to object overhead.
// Cannot accept user input dynamically.

// Time Complexity (T.C) & Space Complexity (S.C)
// Implementation	Time Complexity	Space Complexity
// 1st (int[])	O(n) (inserting into HashSet)	O(n) (HashSet storage)
// 2nd (Integer[])	O(n) (creating list + inserting into HashSet)	O(n) (List + HashSet storage)
// Both have O(n) time complexity, but:

// The 1st implementation (int[]) is better for memory because primitive int takes less space than Integer objects.
// The 2nd implementation (Integer[]) is more concise but has extra memory overhead due to Integer objects and Arrays.asList().