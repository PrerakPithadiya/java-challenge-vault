package Rajesh_Sir_Problems;

import java.util.Scanner;

// A class to count the number of letters in a string
class LetterCounter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        // Read the input string
        String inputString = scanner.nextLine();

        // Count the number of letters in the input string
        int numOfLetters = countLetters(inputString);

        // Print the number of letters
        System.out.println("The number of letters are: " + numOfLetters);

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }

    // A method to count the number of letters in a string
    public static int countLetters(String str) {
        int length = str.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            // Check if the character is a letter (either uppercase or lowercase)
            if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
                count++;
            }
        }
        return count;
    }
}