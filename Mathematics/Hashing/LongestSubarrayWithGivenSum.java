import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithGivenSum {
    public static int maxLen(int arr[], int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int preSum = 0, res = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];

            if (preSum == sum)
                res = i + 1;

            if (!map.containsKey(preSum)) 
                map.put(preSum, i);

            if (map.containsKey(preSum - sum))
                res = Math.max(res, i - map.get(preSum - sum));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter the target sum: ");
        int sum = sc.nextInt();

        int result = maxLen(arr, sum);
        System.out.println("Length of the longest subarray with sum " + sum + " is: " + result);

        sc.close();
    }
}