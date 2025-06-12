import java.util.Scanner;

public class SubsetGenerator {
    // Recursive function to generate subsets
    private static void generateSubsets(String str, String current, int index) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }
        
        // Exclude the current character and move to the next
        generateSubsets(str, current, index + 1);
        
        // Include the current character and move to the next
        generateSubsets(str, current + str.charAt(index), index + 1);
    }
	
	
	
	// str → The original input string.
	// current → The subset that has been generated so far.
	// index + 1 → The next position in the string that we are processing.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        System.out.println("Subsets:");
        generateSubsets(input, "", 0);
        scanner.close();
    }
}
// Enter a string: ABC
// Subsets:
//""
// C
// B
// BC
// A
// AC
// AB
// ABC

// Time Complexity	O(2^n \cdot n) (or O(2^n) if ignoring output)
// Space Complexity	O(n) (due to recursion stack)