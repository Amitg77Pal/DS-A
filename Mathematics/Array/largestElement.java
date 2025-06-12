// import java.util.Scanner;
// public class largestElement{
	// public static int getLarge(int[] arr){
		// int largest=arr[0];;
		// for(int i=0;i<arr.length;i++){
			// if(arr[i]>largest){
				// largest=arr[i];
			// }
		// }
		// return largest;

	// }
	
	// public static void main(String[] args){
	// Scanner sc=new Scanner(System.in);
	// System.out.println("Enter the number of elements: ");
	// int n=sc.nextInt();
	// int[] arr=new int[n];
	// System.out.println("Enter the elements of a Array: ");
	// for(int i=0;i<n;i++)
	// {
		// arr[i]=sc.nextInt();
	// }
	// int result=getLarge(arr);
	// System.out.println("Print the largest Element: "+result);
	
	// }
// }

import java.util.Scanner;
public class largestElement{
	public static int getLargest(int[] arr){
		int large=Integer.MIN_VALUE;
		for(int num:arr){
			if(num>large){
				large=num;
			}
			
		}
		return large;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of a Array: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int result=getLargest(arr);
		System.out.println("Print the largest Element: "+result);
			
	}
}