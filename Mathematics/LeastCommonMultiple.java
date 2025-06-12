// Brute-Force Method

// import java.util.Scanner;
// public class LeastCommonMultiple{
	// public static int lcm(int a,int b)
	// {
		// int max=Math.max(a,b);
		// while(true){
			// if(max%a==0&&max%b==0){
			// return max;
			// }
			// max++;
		// }
	// }
	// public static void main(String[] args){
	// Scanner sc=new Scanner(System.in);
	// System.out.println("Enter 1st num:");
	// int a=sc.nextInt();
	// System.out.println("Enter 2nd num:");
	// int b=sc.nextInt();
	// System.out.println("LeastCommonMultiple of a and b: "+lcm(a,b));
	
	// }
// }

// Time complexity: best case:- O(1) (if both numbers are equal).
				 // Wrost case:- O(a×b) (if the LCM is the product of the two number
// Space Complexity: O(1), as no additional space is used.

//Optimized Method (Using GCD)
import java.util.Scanner;
public class LeastCommonMultiple{
	public static int gcd(int a,int b){
		if(b==0){
			return a;
	}
	return gcd(b,a%b);
	}
	public static int lcm(int a,int b){
		return (a*b)/(gcd(a,b));//lcm(a,b)=(a*b)/gcd(a,b);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st num:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd num:");
		int b=sc.nextInt();
		System.out.println("LeastCommonMultiple of a and b: "+lcm(a,b));
	}
}

// Time complexity: best case:-O(log(min(a,b))) (for GCD computation).
				 // Wrost case:- O(log(min(a,b)))
// Space Complexity: O(1),as no extra space is required.
