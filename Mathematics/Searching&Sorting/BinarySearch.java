// import java.util.Scanner;

// public class BinarySearch {

//     static boolean binarySearch(int[] arr, int pivot) {
//         int start = 0, end = arr.length - 1;

//         while (start <= end) {
//             int mid = start + (end - start) / 2; // Safe mid calculation

//             if (arr[mid] == pivot) {
//                 return true;
//             } else if (arr[mid] > pivot) {
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }
//         }

//         return false;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter " + n + " sorted elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter the element to search: ");
//         int pivot = sc.nextInt();

//         boolean found = binarySearch(arr, pivot);

//         if (found) {
//             System.out.println("Element found in the array");
//         } else {
//             System.out.println("Element not found in the array");
//         }

//         sc.close();
//     }
// }

import java.util.Scanner;
public class BinarySearch{
    public static boolean binary(int[] arr,int str,int end,int pivot){
        int n=arr.length;
        if(str>end){
            return false;
        }
        int mid=str + (end - str) / 2;
        if(arr[mid]==pivot)
        {
            return true;
        }
        if(arr[mid]<pivot)
        {
            return binary(arr,mid+1,end,pivot);
        }
        if(arr[mid]>pivot)
        {
            return binary(arr,str,mid-1,pivot);
        }
        return false;


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int pivot=sc.nextInt();
        boolean result=binary(arr,0,n-1,pivot);
         if (result) {
            System.out.println("Element found in the array");
        } else {
            System.out.println("Element not found in the array");
        }

    } 

}


