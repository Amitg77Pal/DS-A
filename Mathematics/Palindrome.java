// import java.util.Scanner;

// public class Palindrome {

    // public static boolean isPal(int n) {
        // int original = n;
        // int reverse = 0;
        // while (n > 0) {
            // int rem = n% 10;
            // reverse = reverse * 10 + rem;
            // n= n/ 10;
        // }
        // return original == reverse;
    // }

    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
		 // System.out.println("Enter the num: ");
        // int n = sc.nextInt();

        // if (isPal(n)) {
            // System.out.println("Palindrome");
        // } else {
            // System.out.println("Not a Palindrome");
        // }
    // }
// }

// Time Complexity: 
// 𝑂(log10(𝑛))
// Space Complexity: 
// O(1)

// import java.util.Scanner;
// public class Palindrome{
	// public static boolean isPal(int n){
		// int original=n;
		// int reverse=0;
		// while(n>0){
			// int rem=n%10;
			// reverse=reverse*10+rem;
			// n=n/10;
		// }
		// return original==reverse;
	// }
	// public static void main(String[] args){
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the start of the range:");
		// int start=sc.nextInt();
		// System.out.println("Enter the end of the range:");
		// int end=sc.nextInt();
		// System.out.println("Palindrome no. in the range to " +start+"to "+end);
		// for(int i=start;i<=end;i++){
			// if(isPal(i)){
				// System.out.println(i+" ");
			// }
			
		// }
		
		
	// }
// }
	
import java.util.Scanner;
public class Palindrome{
	public static boolean isPal(String str){
		str=str.toLowerCase();
		String reverse=new StringBuilder(str).reverse().toString();
		return str.equals(reverse);
		
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String: ");
		String str=sc.nextLine();
		if(isPal(str))
		{
			System.out.println("it is Palindrome");
		}
		else{
			System.out.println("it is not Palindrome");
		}
	}
	
	
}

// Time Complexity: 
// O(n), where 
// 𝑛
// n is the length of the string, as reversing the string and comparing it both take linear time.
// Space Complexity: 
// O(n), due to the additional space used for storing the reversed string.