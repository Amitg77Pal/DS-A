// import java.util.Arrays;
// import java.util.Scanner;

// public class StringFormulationChecker {
    // public static boolean areStringsFormulated(String s1, String s2) {
        // if (s1.length() != s2.length()) {
            // return false;
        // }
        
        ////Convert strings to char arrays and sort them
        // char[] charArray1 = s1.toCharArray();
        // char[] charArray2 = s2.toCharArray();
        // Arrays.sort(charArray1);
        // Arrays.sort(charArray2);
        
        ////Compare sorted arrays
        // return Arrays.equals(charArray1, charArray2);
    // }

    // public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // System.out.println("String Formulation Checker");
        // System.out.println("--------------------------");
        
        ////Get first string input
        // System.out.print("Enter first string: ");
        // String firstString = scanner.nextLine();
        
        ////Get second string input
        // System.out.print("Enter second string: ");
        // String secondString = scanner.nextLine();
        
        ////Check if strings are formulated
        // boolean result = areStringsFormulated(firstString, secondString);
        
        ////Display result
        // System.out.println("\nResult: " + (result ? "Yes" : "No"));
        
        // scanner.close();
    // }
// }

//· Time Complexity: O(n log n) average,
 //O(n2)-worst-case.

//· Space Complexity: O(n).
//. Best for: Small strings, readability-focused code.
//. Faster alternative: Use frequency-counting with an array for O(n) time.

// import java.util.Scanner;

// public class StringFormulationChecker {
    // public static boolean areStringsFormulated(String s1, String s2) {
        ////First check: lengths must be equal
        // if (s1.length() != s2.length()) {
            // return false;
        // }

        ////Create a frequency array (assuming ASCII characters)
        // int[] frequency = new int[256]; // Covers extended ASCII

       //// Count characters in s1
        // for (char c : s1.toCharArray()) {
            // frequency[c]++;
        // }

        ////Subtract counts for s2
        // for (char c : s2.toCharArray()) {
            // frequency[c]--;
            ////If any count goes negative, strings don't match
            // if (frequency[c] < 0) {
                // return false;
            // }
        // }

        // return true;
    // }

    // public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // System.out.println("String Anagram Checker");
        // System.out.println("----------------------");
        
        ////Get user input for both strings
        // System.out.print("Enter first string: ");
        // String firstString = scanner.nextLine();
        
        // System.out.print("Enter second string: ");
        // String secondString = scanner.nextLine();
        
        ////Check if strings are anagrams
        // boolean result = areStringsFormulated(firstString, secondString);
        
        ////Display the result
        // System.out.println("\nThe strings are " + (result ? "anagrams" : "not anagrams"));
        
        // scanner.close();
    // }
// }




////· Time Complexity: O(n) (linear time).
////· Space Complexity: O(1) (constant space).
////· Best for: Fast, memory-efficient anagram checks (ASCII strings).
////. Alternative for Unicode: Use HashMap (but with O(n) space).


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringFormulationChecker {
    public static boolean areStringsFormulated(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Count frequencies for s1
        for (char c : s1.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Decrement counts for s2
        for (char c : s2.toCharArray()) {
            if (!frequencyMap.containsKey(c)) {
                return false;
            }
            frequencyMap.put(c, frequencyMap.get(c) - 1);
            if (frequencyMap.get(c) == 0) {
                frequencyMap.remove(c);
            }
        }
        
        return frequencyMap.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        while (true) {
            System.out.println("\nEnter two strings to check (or type 'exit' to quit):");
            
            System.out.print("First string: ");
            String firstString = scanner.nextLine();
            
            if (firstString.equalsIgnoreCase("exit")) {
                break;
            }
            
            System.out.print("Second string: ");
            String secondString = scanner.nextLine();
            
            boolean result = areStringsFormulated(firstString, secondString);
            
            System.out.println("\nResults:");
            System.out.println("------------------------------");
            System.out.println("Strings: \"" + firstString + "\" and \"" + secondString + "\"");
            System.out.println("Same length: " + (firstString.length() == secondString.length() ? "Yes" : "No"));
            System.out.println("Formulated: " + (result ? "YES" : "NO"));
            System.out.println("------------------------------");
            
            System.out.print("\nCheck another pair? (yes/no): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }
        
        System.out.println("\nThank you for using the String Formulation Checker!");
        scanner.close();
    }
}

 ////Time Complexity: O(n) (linear time).
//// Space Complexity: O(k) best for -Unicode,general purpose