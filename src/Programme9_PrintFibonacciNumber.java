/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme9_PrintFibonacciNumber {
    public static void main(String[] args) {

        int a = 0, b = 1; // To store values of current and next number
        int s = 8;  // Print 8 iteration of Fibonacci number series

        for (int i = 0; i <= s; ++i) // for loop to go until 8 iterations, ++i increments the value first and then is used
        {
            System.out.print(a + " ");
            int sum = a + b; // adding the first and second number
            a = b; // swapping the value of a
            b = sum; // swapping the value of b
        }
    }
}
