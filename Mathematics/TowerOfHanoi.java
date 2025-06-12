import java.util.Scanner;

public class TowerOfHanoi {
    
    // Recursive function to solve Tower of Hanoi
    private static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        
        // Move (n-1) disks from source to auxiliary using destination as helper
        solveHanoi(n - 1, source, destination, auxiliary);
        
        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        
        // Move (n-1) disks from auxiliary to destination using source as helper
        solveHanoi(n - 1, auxiliary, source, destination);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter source peg: ");
        char source = scanner.next().charAt(0);
        
        System.out.print("Enter auxiliary peg: ");
        char auxiliary = scanner.next().charAt(0);
        
        System.out.print("Enter destination peg: ");
        char destination = scanner.next().charAt(0);
        
        System.out.print("Enter number of disks: ");
        int n = scanner.nextInt();
        
        System.out.println("Tower of Hanoi solution:");
        solveHanoi(n, source, auxiliary, destination);
        
        scanner.close();
    }
}


// Enter source peg: A
// Enter auxiliary peg: B
// Enter destination peg: C
// Enter number of disks: 3
// Tower of Hanoi solution:
// Move disk 1 from A to C
// Move disk 2 from A to B
// Move disk 1 from C to B
// Move disk 3 from A to C
// Move disk 1 from B to A
// Move disk 2 from B to C
// Move disk 1 from A to C


// T(n)=2T(n−1)+O(1)
// Time Complexity	O(2^n) (Exponential)
// Space Complexity	O(n) (Recursive Stack)
