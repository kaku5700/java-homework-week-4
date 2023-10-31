import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme12_PrimeNumber {
    public static void main(String[] args) {
        primes(); // calling primes method
    }

    // Static method returning true or false depending on whether the number is prime or not
    public static boolean primes() {
        int num; // Integer declaration
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        num = scan.nextInt(); // Storing user entered number
        scan.close();
        for (int i = 2; i < num; i++) { // for loop increasing value by 1 whilst keeping it less than what user entered
            if (num % i == 0) { // Checking whether user entered number and remainder of i equals zero.
                System.out.println(num + " is not a Prime Number.");
                return false;
            }
        }
        System.out.println(num + " is a Prime Number.");
        return true;
    }
}
