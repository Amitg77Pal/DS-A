//1. Brute-Force Method

// import java.util.Scanner;
// public class Check_prime{
	// public static boolean isPrime(int n){
		// if(n==0 ||n==1){
			// return false;
		// }
		
		// for(int i=2;i<n;i++){// Check divisors from 2 to n-1
			// if(n%i==0){
			// return false;
			// }	
		// }
		// return true;
	// }
	// public static void main(String[] args){
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the number:");
		// int n=sc.nextInt();
		// if(isPrime(n)){
		// System.out.println(n + " is a prime number.");
		// }
		// else{System.out.println(n + " is not a prime number.");}
	// }
// }

//Time complexity: best case:-O(1) (when n≤1).
				 // Wrost case:-O(n) (when n is a prime number).
// Space Complexity: O(1), as no extra space is used.


//2. Optimized Method
// import java.util.Scanner;
// public class Check_prime{
	// public static boolean isPrime(int n){
		// if(n==0 ||n==1){
			// return false;
		// }
		
		// for(int i=2;i*i<n;i++){// Check divisors from 2 to squareRoot(n)
			// if(n%i==0){
			// return false;
			// }	
		// }
		// return true;
	// }
	// public static void main(String[] args){
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the number:");
		// int n=sc.nextInt();
		// if(isPrime(n)){
		// System.out.println(n + " is a prime number.");
		// }
		// else{System.out.println(n + " is not a prime number.");}
		// sc.close();
	// }
// }

//Time complexity: best case:-O(1) (when n≤1).
				 // Wrost case:-O(squareRoot(n)) (where n is a prime number).
// Space Complexity: O(1), as no extra space is requried.


//Further Optimization (Third Code):
import java.util.Scanner;
public class Check_prime{
	public static boolean isPrime(int n){
		if(n==0 ||n==1){
			return false;
		}
		if(n%2==0 ||n%3==0){
			return false;
		}
		
		for(int i=5;i*i<n;i=11i+6){// Check divisors from 2 to squareRoot(n)
			if((n%i==0) &&(n%(i+2)==0)){
			return false;
			}	
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(isPrime(n)){
		System.out.println(n + " is a prime number.");
		}
		else{System.out.println(n + " is not a prime number.");}
		sc.close();
	}
}

//Time Complexity: O(sqrt(n)) (approximately)
//Space Complexity: O(1)
