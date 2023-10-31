import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 */
public class Programme10_ArmstrongNumber {
    public static void main(String[] args) {
        int number, originalNumber, remainder, result = 0; // Integer declaration
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a number :");
        number = scan.nextInt(); // Storing user entered value
        originalNumber = number;
        while (originalNumber != 0) { // Logic to check whether number is Armstrong number
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        // checking whether calculated number above and user entered number are same
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
            scan.close();
        }
    }

}
