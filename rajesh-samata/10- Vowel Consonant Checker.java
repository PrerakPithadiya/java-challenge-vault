package Rajesh_Sir_Problems;

import java.util.Scanner;

// A class to check if a character is a vowel or consonant
class VowelConsonantChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");

        // Read the input character
        char character = scanner.next().trim().charAt(0);

        // Check if the entered character is a vowel or consonant and print the result
        if (isVowel(character)) {
            System.out.println("The character '" + character + "' is a vowel.");
        } else {
            System.out.println("The character '" + character + "' is a consonant.");
        }

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }

    // A method to check if a character is a vowel
    public static boolean isVowel(char character) {
        return (character == 'a') || (character == 'e') || (character == 'i') || (character == 'o') || (character == 'u') || (character == 'A') || (character == 'E') || (character == 'I') || (character == 'O') || (character == 'U');
    }
}