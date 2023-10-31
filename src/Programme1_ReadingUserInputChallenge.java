import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 */

public class Programme1_ReadingUserInputChallenge {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 1;//Integer Declaration
        int sum = 0;

        while (count <= 10) { // While loop ensuring only 10 inputs are allowed.
            System.out.println("Please Enter number : ");//Asking user to enter numbers in sequence
            boolean validateNumber = scan.hasNextInt();//Making sure only enter numbers.
            if (validateNumber) {
                int number = scan.nextInt();
                sum += number; // Assignment operater for adding the number inserted
                count++; // incrementing count value displayed everytime user enter a number.
            } else {
                System.out.println("Invalid number!"); //Will tell user they have not entered a number
            }
            // Asking for new user input
            scan.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum); // Printing the total of all 10 numbers entered
        scan.close();

    }

}
