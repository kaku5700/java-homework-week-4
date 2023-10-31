/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 */
public class Programme11_EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) { // Static method with parameter and integer return type
        int originalNumber = number;
        int lastDigit;
        int sumOfEvenDigits = 0;
        if (number >= 0) {
            while (number > 0) {
                lastDigit = number % 10; // finding last digit value
                if (lastDigit % 2 == 0) { // finding whether last digit was even
                    sumOfEvenDigits += lastDigit; // adding last digit to previous if it was even
                }
                number /= 10; // removing last number
            }
            if (originalNumber >= 0) {
                System.out.println();
            }
            return sumOfEvenDigits;
        }
        System.out.println();
        return -1; // returns -1 for numbers less than 0
    }

}
