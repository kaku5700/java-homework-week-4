/**
 * Write a method with the name sumDigits that has one int parameter called number.
 */

public class Programme4_DigitSumChallenge {
    public static void main(String[] args) {

        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(-6));
        System.out.println(sumDigits(12345));
    }

    private static int sumDigits(int number) { // With Return With Parameter Method

        if (number < 10) { // Will return -1 if Number is less than 10
            return -1;
        }

        int sum = 0; // Integer declaration
        while (number > 0) { // if multiple numbers are entered they all will be added
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
