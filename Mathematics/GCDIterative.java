
////Best Case Code: Iterative Euclidean Algorithm//optimized
// import java.util.Scanner;

// public class GCDIterative {

    // public static int gcd(int a, int b) {
        // while (b != 0) {
            // int temp = b;
            // b = a % b;
            // a = temp;
        // }
        // return a;
    // }

    // public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the first number (a): ");
        // int a = scanner.nextInt();

        // System.out.print("Enter the second number (b): ");
        // int b = scanner.nextInt();

        // int result = gcd(a, b);
        // System.out.println("The GCD of " + a + " and " + b + " is: " + result);

        // scanner.close();
    // }
// }

// Time complexity: best case:-O(log(min(a,b)))
				 // Wrost case:-O(log(min(a,b)))
// Space Complexity: O(1)

//Worst Case Code: Subtraction-Based Algorithm

import java.util.Scanner;
public class GCDIterative{
	public static int gcd(int a,int b){
		while(a!=b){
			if(a>b)
			{
				a=a-b;
			}
			else{
				b=b-a;
			}
		}
		return a;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st num: ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd num: ");
		int b=sc.nextInt();
		System.out.println("The Gretest comman divisor: "+ gcd(a,b));
	}
}

// Time complexity: best case:-O(min(a,b))
				 // Wrost case:-O(max(a,b))
// Space Complexity: O(1)

