// import java.util.Scanner;

// public class SwapAdjacent {
    // public static String swap_Adjacent(String str) {
        // char[] chars = str.toCharArray();
        // for (int i = 0; i < chars.length - 1; i += 2) {
            // char temp = chars[i];
            // chars[i] = chars[i + 1];
            // chars[i + 1] = temp;
        // }
        // return new String(chars);
    // }

    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number of test cases: ");
        // int n = sc.nextInt();
        // sc.nextLine(); // Consume newline

        // for (int i = 0; i < n; i++) {
            // System.out.print("Enter string: ");
            // String str = sc.nextLine();
            // String result = swap_Adjacent(str);
            // System.out.println("Output: " + result);
        // }

        // sc.close();
    // }
// }


// Input:-
// Enter number of test cases: 2
// Enter string: abcdef
// Output: badcfe
// Enter string: remenember
// Output: eremenbmre

// Enter number of test cases: 4
// Enter string: a
// Output: a
// Enter string: "
// Output: "
// Enter string: ""
// Output: ""
// Enter string: " "
// Output:  ""

// Complexity	Value
// Time Complexity	O(N)
// Space Complexity	O(N)


//___________________________________________________________________________________________________________________________________________________
//swap adjecent except middle if it is odd
// // Skip swapping around the middle character for odd-length strings
import java.util.Scanner;

public class SwapAdjacent {
    public static String swapAdjacent(String str) {
        char[] ch = str.toCharArray();
        int length = ch.length;
        int mid = length / 2;

        for (int i = 0; i < length - 1; i += 2) {
            // Skip swapping if it's the middle character in an odd-length string
            if (length % 2 == 1 && i == mid - 1) {
                continue;
            }
            // Swap adjacent characters
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear the newline character from the buffer

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            String result = swapAdjacent(str);
            System.out.println("Output: " + result);
        }
        sc.close();
    }
}
