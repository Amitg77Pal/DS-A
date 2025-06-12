// import java.util.Scanner;
// public class TrilingZeroes{

	// public static long fact(int n){
		// if(n==0||n==1){
			// return 1;
		// }
		// long prod=1;
		// for(int i=2;i<=n;i++){
			// prod=prod*i;	
		// }
		// return prod;	
	// }
	// public static int Tril_Zeroes(long n){
		// int res=0;
		// if(n%10==0){
		// res++;
		// n=n/10;
		// }
		// return res;
	// }
	
	// public static void main(String[] args){
	// Scanner sc=new Scanner(System.in);
	// System.out.println("Enter the number: ");
	// int n=sc.nextInt();
	// int x=Tril_Zeroes(fact(n));
	
	
	// System.out.println("Factorial of n: "+fact(n));
	// System.out.println("No.of TrilingZeroes: "+x);
	
	
	
	// }
	
	
// }

// Time Complexity: O(n) (due to the factorial computation).
// Space Complexity: O(1) (constant space usage).

import java.util.Scanner;

public class TrilingZeroes {

    // Method to calculate the factorial (not used for trailing zeroes calculation)
    public static long fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long prod = 1;
        for (int i = 2; i <= n; i++) {
            prod = prod * i;
        }
        return prod;
    }

    // Method to calculate trailing zeroes in factorial
    public static int Tril_Zeroes(int n) {
        int res = 0;
        for (int i = 5; i <= n; i = i * 5) {
            res = res + n / i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        // Calculate the number of trailing zeroes
        int x = Tril_Zeroes(n);

        // Print the results
        System.out.println("No. of trailing zeroes in " + n + "! is: " + x);
    }
}

// Time Complexity: O(log n)
// Space Complexity: O(1)





