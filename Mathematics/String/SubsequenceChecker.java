import java.util.Scanner;
public class SubsequenceChecker
{
	public static boolean isSequence(String big,String small)
	{
		int n=big.length();
		int m=small.length();
		int index=0;
		for(int i=0;i<n&&index<m;i++)
		{
			if(big.charAt(i)==small.charAt(index))
			{
				index++;
			}
		}
		return index==m;
		
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String big=sc.nextLine();
		String small=sc.nextLine();
		boolean result=isSequence(big,small);
		if(result)
		{
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		
		
	}
}
