/**
 * Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class Programme8_RightAngleTriangle {
    public static void main(String[] args) {

        int n = 5; // Integer for number of rows to be printed
        int a, b;

        for (a = 0; a < n; a++) { // for loop to go until row 5 whilst adding the column by 1
            for (b = 0; b <= a; b++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}
