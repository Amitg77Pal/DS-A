import java.util.Scanner;

public class RopeCutting {
    
    // Recursive function to find the maximum number of pieces
    static int maxPieces(int n, int a, int b, int c) {
        // Base Case: If rope length is exactly 0, return 0 (valid cut)
        if (n == 0) return 0;
        
        // If rope length becomes negative, return -1 (invalid cut)
        if (n < 0) return -1;
        
        // Recursively try to cut the rope with lengths a, b, or c
        int resA = maxPieces(n - a, a, b, c);
        int resB = maxPieces(n - b, a, b, c);
        int resC = maxPieces(n - c, a, b, c);
        
        // Find the maximum result among the three options
        int maxRes = Math.max(resA, Math.max(resB, resC));
        
        // If no valid cut was found, return -1
        if (maxRes == -1) return -1;//if (maxRes<0) return -1;
        
        // Otherwise, return 1 + maxRes (since we made a cut)
        return maxRes + 1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter rope length (n): ");
        int n = scanner.nextInt();
        
        System.out.print("Enter first cut length (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second cut length (b): ");
        int b = scanner.nextInt();
        
        System.out.print("Enter third cut length (c): ");
        int c = scanner.nextInt();
        
        scanner.close();
        
        // Compute maximum number of pieces
        int result = maxPieces(n, a, b, c);
        
        // Display result
        System.out.println("Maximum number of pieces: " + result);
    }
}

//T(n)=T(n−a)+T(n−b)+T(n−c)+O(1)
//Time_Complexity->T(n)=3^n
// worst-case space complexity is:O(n)