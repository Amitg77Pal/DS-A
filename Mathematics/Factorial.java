// import java.lang.*;
// import java.util.Scanner;
//The java.lang package contains fundamental classes like Math, String, Integer, System, etc., which are used frequently in Java programs.
// public class Factorial{
	// public static long fun(int n){
		// if(n==0||n==1)
		// {
			// return 1;
		// }
		// else{
			// return n*fun(n-1);
		// }
		
	// }
	// public static void main(String[] args){
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the num :");
		// int n=sc.nextInt();
		// System.out.println("The factorial of x is :"+fun(n));
	// }
// }
// Wrost case
// Time Complexity:=O(n), as the function is called n times.
// Space Complexity: O(n), as each function call occupies space on the call stack.

import java.lang.*;
import java.util.Scanner;
public class Factorial{
	public static long fun(int n){
		if(n==0 ||n==1){
			return 1;
		}
		else{
			long prod=1;
			for(int i=2;i<=n;i++){
				prod=prod*i;
			}
			return prod;
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		System.out.println("The factorial of n is: "+fun(n));
	} 
	
	
}
// Best case:-
// Time Complexity: 
// O(n), as the loop runs n−1 times.
// Space Complexity: 
// O(1), as no additional space is used except for the result variable.
