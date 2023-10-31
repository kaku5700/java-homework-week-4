import java.util.Scanner;

/**
 * Write a Java Program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class Programme3_VowelOrConstant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please insert any Upper or Lower Case Single Character Value: ");
        String letter = scan.next().toLowerCase(); // Converting user value to lower case and storing in letter variable
        boolean uppercase = letter.charAt(0) >= 65 && letter.charAt(0) <= 90; // Identifying whether Character is uppercase by ASCII value
        boolean lowercase = letter.charAt(0) >= 97 && letter.charAt(0) <= 122; // // Identifying whether Character is lowercase by ASCII value
        boolean vowels = letter.equals("a") || letter.equals("e") || letter.equals("i") // in case of vowel boolean will return true
                || letter.equals("o") || letter.equals("u"); // for any other character it will identify as Consonant

        if (letter.length() > 1) // If multiple Characters are entered it will show error.
        {
            System.out.println("Error! Please enter Single Character only.");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error! Please Enter uppercase or lowercase letter only."); // If anything else is entered it will show error.
        } else if (vowels) // If Vowel is identified it will print out Vowel message.
        {
            System.out.println("Inserted Character is Vowel.");
        } else {
            System.out.println("Inserted Character is Consonant."); // If vowel is not identified it will print out Consonant message.
        }
        scan.close();
    }

}
