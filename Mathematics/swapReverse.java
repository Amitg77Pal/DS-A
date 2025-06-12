import java.util.Scanner;

public class swapReverse {
    public static String reverse(String str) {
        char[] amit = str.toCharArray();
        int left = 0, right = amit.length - 1;
        
        while (left < right) {
            // Swap characters
            char temp = amit[left];
            amit[left] = amit[right];
            amit[right] = temp;
            left++;
            right--;
        }
        return new String(amit);
		//return new String(amit).toLowerCase(); // Convert to lowercase before returning
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline after reading the integer

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the string: ");
            String str = sc.nextLine();
            String result = reverse(str);
            System.out.println("Output: " + result);
        }
        sc.close();
    }
}


// Enter the number of test cases: 1
// Enter the string: AmitPal
// Output: laPtimA