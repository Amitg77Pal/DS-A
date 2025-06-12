class amit1
{
    public static void main(String[] args) {
        int n = 5; // Example value for n
        int result = calculateSum(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + result);
    }

    public static int calculateSum(int n) {
        if (n <= 0) {
            return 0; // Base case: if n is less than or equal to 0, return 0
        }
        return n + calculateSum(n - 1); // Recursive case: sum n and the sum of the previous numbers
    }
}