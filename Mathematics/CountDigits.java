//method-1
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Prompt user for input
       System.out.println("Enter a sequence of digits separated by spaces:");
        String x = sc.nextLine();

        //Remove spaces String replace(CharSequence target, CharSequence replacement)

        //Count the digits 
        int count = store.length();

        //Print the count
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
//T.C=O(n)
 
//The line String digitsOnly = input.replaceAll("\\s", ""); is used to remove all whitespace characters from a given string
// Enter a sequence of digits separated by spaces:
// 1 -2 3 -5

// Number of digits: 6

//Method-2 
// import java.util.Scanner;

// public class CountDigits {
    //Method to count the number of digits in a number
    // public static int Count_fun(int num) {
        // int count = 0;
        // while (num > 0) {
            // num = num / 10; // Remove the last digit
            // count++;        // Increment the count
        // }
        // return count;
    // }

    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        //Input from the user
        // System.out.println("Enter a number:");
        // int x = sc.nextInt(); // Read integer input

        //Call the function and display the result
        // int count = Count_fun(x);
        // System.out.println("Number of digits: " + count);

        // sc.close();
    // }
// }


	


