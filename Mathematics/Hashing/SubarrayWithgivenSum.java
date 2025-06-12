// import java.util.Scanner;
// public class SubarrayWithgivenSum
// {
	// public static boolean hasCountSumSubarray(int[] arr, int n, int sum)
	// {
		// for(int i = 0; i < n; i++)
		// {
			// int curr_sum = 0;
			// for(int j = i; j < n; j++)
			// {
				// curr_sum = curr_sum + arr[j];
				// if(curr_sum == sum)
				// {
					// return true;
				// }
			// }
		// }
		// return false;
	// }

	// public static void main(String[] args)
	// {
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// int[] arr = new int[n];
		// for(int i = 0; i < n; i++)
		// {
			// arr[i] = sc.nextInt();
		// }
		// int sum = sc.nextInt();
		// boolean result = hasCountSumSubarray(arr, n, sum);
		// if(result)
		// {
			// System.out.println("true");
		// }
		// else
		// {
			// System.out.println("false");
		// }
		// sc.close();
	// }
// }

import java.util.HashSet;
import java.util.Scanner;

public class SubarrayWithGivenSum
{
	public static boolean hasCountSumSubarray(int[] arr, int n, int sum)
	{
		HashSet<Integer> set = new HashSet<>();
		int curr_sum = 0;
		
		for (int i = 0; i < n; i++)
		{
			curr_sum += arr[i];

			if (curr_sum == sum)
			{
				return true;
			}

			if (set.contains(curr_sum - sum))
			{
				return true;
			}

			set.add(curr_sum);
		}
		return false;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int sum = sc.nextInt();
		boolean result = hasCountSumSubarray(arr, n, sum);
		if (result)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		sc.close();
	}
}
