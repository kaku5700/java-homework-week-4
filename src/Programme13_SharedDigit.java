/**
 *
 */
public class Programme13_SharedDigit {
    // Main method calling hasSharedDigit method and providing test data to check result.
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    // Static boolean method returning true or false according to if and while statement
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        // if any of the numbers are less than 10 or greater than 99 return false
        if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
            return false;
        }
        // logic to find modulus and remainder in both digits and checking if they equal then return true or false accordingly
        int testFirstNumber = firstNumber;
        while (testFirstNumber != 0) {
            int testSecondNumber = secondNumber;
            while (testSecondNumber != 0) {
                if ((testFirstNumber % 10) == (testSecondNumber % 10)) {
                    return true;
                }
                testSecondNumber /= 10;
            }
            testFirstNumber /= 10;
        }
        return false;
    }
}
