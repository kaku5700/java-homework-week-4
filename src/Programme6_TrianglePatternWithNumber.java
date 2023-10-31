/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 2
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */

public class Programme6_TrianglePatternWithNumber {
    public static void main(String[] args) {
        int i, j; // Declaring Variable for Column value
        int n = 10; // Declaring Variable for Row value

        for (i = 1; i <= n; i++) { // for loop increasing column value by 1 and printing them
            for (j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println("");
        }
    }
}
