// import java.util.Scanner;
// public class SumofNatural{
	// public static int getSum(int n){
		// if(n==0){
		// return 0;
		// }
		// return n+getSum(n-1);
	// }
	// public static void main(String[] args){
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the number: ");
		// int n=sc.nextInt();
		// System.out.println(getSum(n));
	// }
// }
//Time complexity:o(n)
//space Complexity:o(n)

// import java.util.Scanner;
// public class SumofNatural {
    // public static long sumUsingFormula(long n) {
        // return (n * (n + 1)) / 2;
    // }

    // public static void main(String[] args) {
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the number: ");
        // long n=sc.nextLong();
        // System.out.println("Sum: " + sumUsingFormula(n));
    // }
// }

// Time Complexity: O(1) (Constant time, just one multiplication and division)
// ✅ Space Complexity: O(1) (No extra memory used)
// 🔥 Best case: Always O(1), regardless of input size.

// public class SumNaturalNumbersLoop {
    // public static long sumUsingLoop(long n) {
        // long sum = 0;
        // for (long i = 1; i <= n; i++) {
            // sum += i;
        // }
        // return sum;
    // }

    // public static void main(String[] args) {
        // long n = 1000000000L;  // Large number
        // System.out.println("Sum: " + sumUsingLoop(n));
    // }
// }

// 🔴 Time Complexity: O(n) (Linear time, loop runs n times)
// 🔴 Space Complexity: O(1) (Constant extra space, but CPU intensive)
// ⚠️ Worst case: O(n), when n is very large, making it impractical.
