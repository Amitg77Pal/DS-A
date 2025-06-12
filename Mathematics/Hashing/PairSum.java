// import java.util.Scanner;

// public class PairSum {
    // Function to check if there exists a pair with the given sum
    // public static boolean isPair(int arr[], int n, int sum) {
        // for (int i = 0; i < n; i++) {
            // for (int j = i + 1; j < n; j++) {
                // if (arr[i] + arr[j] == sum) {
                    // return true;
                // }
            // }
        // }
        // return false;
    // }

    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // Input array size
        // System.out.print("Enter the number of elements: ");
        // int n = sc.nextInt();
        // int arr[] = new int[n];

        // Input array elements
        // System.out.println("Enter the elements:");
        // for (int i = 0; i < n; i++) {
            // arr[i] = sc.nextInt();
        // }

        // Input the target sum
        // System.out.print("Enter the target sum: ");
        // int sum = sc.nextInt();

        // Function call and output
        // if (isPair(arr, n, sum)) {
            // System.out.println("Pair exists with sum " + sum);
        // } else {
            // System.out.println("No pair exists with sum " + sum);
        // }

        // sc.close();
    // }
// }

//Method-2-------------------------------------------------------------------
// import java.util.Scanner;

// public class PairSum {
    ////Function to print all pairs with the given sum
    // public static void isPair(int arr[], int n, int sum) {
        // boolean found = false;

        // for (int i = 0; i < n; i++) {
            // for (int j = i + 1; j < n; j++) {
                // if (arr[i] + arr[j] == sum) {
                    // System.out.println("Pair: (" + arr[i] + ", " + arr[j] + ")");
                    // found = true;
                // }
            // }
        // }

        // if (!found) {
            // System.out.println("No pair exists with sum " + sum);
        // }
    // }

    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        ////Input array size
        // System.out.print("Enter the number of elements: ");
        // int n = sc.nextInt();
        // int arr[] = new int[n];

       //// Input array elements
        // System.out.println("Enter the elements:");
        // for (int i = 0; i < n; i++) {
            // arr[i] = sc.nextInt();
        // }

        ////Input the target sum
        // System.out.print("Enter the target sum: ");
        // int sum = sc.nextInt();

        ////Function call to print pairs
        // isPair(arr, n, sum);

        // sc.close();
    // }
// }



//method-3 to count---------------------------------------------

// import java.util.Scanner;

// public class PairSumCount {
   // //Function to count the number of pairs with the given sum
    // public static int isPair(int arr[], int n, int sum) {
        // int count = 0;

        // for (int i = 0; i < n; i++) {
            // for (int j = i + 1; j < n; j++) {
                // if (arr[i] + arr[j] == sum) {
                    // count++; // Count the valid pair
                // }
            // }
        // }

        // return count; // Return the total number of pairs found
    // }

    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

       //// Input array size
        // System.out.print("Enter the number of elements: ");
        // int n = sc.nextInt();
        // int arr[] = new int[n];

       //// Input array elements
        // System.out.println("Enter the elements:");
        // for (int i = 0; i < n; i++) {
            // arr[i] = sc.nextInt();
        // }

       /// Input the target sum
        // System.out.print("Enter the target sum: ");
        // int sum = sc.nextInt();

       //// Function call and output
        // int pairCount = isPair(arr, n, sum);
        // if (pairCount > 0) {
            // System.out.println("Number of pairs with sum " + sum + " is: " + pairCount);
        // } else {
            // System.out.println("No pair exists with sum " + sum);
        // }

        // sc.close();
    // }
// }


// Return Type	Functionality
// boolean	Returns true if a pair exists, otherwise false.
// int	Returns the count of valid pairs that sum to the given value.
// void	Directly prints all pairs that sum to the given value.


