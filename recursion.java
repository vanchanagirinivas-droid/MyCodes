public class recursion {
    
    // Recursive method
    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;   // base case
        } else {
            return n * factorial(n - 1); // recursive call
        }
    }

    public static void main(String[] args) {
        int num = 5;
        long result = factorial(num);
        
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
