import java.util.Scanner;

/**
 * Program to convert letter grade to corresponding numeric value
 * @author Laura Witherspoon
 * CSC201 Assignment 4.14
 * Date 9/17/17
 */

public class LetterGrade {

    /**
     * Converts given letter grade to corresponding numeric value
     * @param letter letter grade to convert
     * @return integer value of given letter grade if valid, otherwise returns -1 if invalid
     */
    public static int convertLetterGradeToNumber(char letter) {
        int value = -1;

        if (letter >= 'A' && letter <= 'D') {
            // Subtract 1 from F because there is no grade 'E'
            value = ('F' - 1) - letter;
        } else if (letter == 'F') {
            value = 0;
        }

        return value;
    }

    public static void main(String[] args) {
        System.out.print("Enter a letter grade: ");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine().toUpperCase();

        // Only allow user to input single character
        while (input.length() != 1) {
            System.out.println("Only a single letter, please: ");
            input = keyboard.nextLine().toUpperCase();
        }
        char letter = input.charAt(0);

        if (convertLetterGradeToNumber(letter) == -1) {
            System.out.println("Not a valid grade.");
        } else {
            System.out.println("The numeric value for grade " + letter + " is " + convertLetterGradeToNumber(letter));
        }

    }
}
