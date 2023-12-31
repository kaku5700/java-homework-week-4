/**
 * Write a method called isPalindrome with one int parameter called number.
 * <p>
 * What is a Palindrome number? A palindrome number is a number which when reversed is equal
 * to the original number. For example: 121, 12321, and 1001 etc
 */
public class Programme5_PalindromeNumber {
    public static void main(String[] args) { // Main method calling isPalindrome Method providing values to be checked
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(523));
    }

    public static boolean isPalindrome(int number) { // With return with parameter static method

        int reverse = 0;
        int originalNumber = number;

        while (number != 0) { // While loop with logic to reverse and compare the number
            int lastDigit = number % 10; // Storing last digit value
            reverse = (reverse * 10) + lastDigit; // Increasing the place value and adding last digit to it
            number /= 10; // Removing last digit of number
        }
        return originalNumber == reverse;
    }

}
