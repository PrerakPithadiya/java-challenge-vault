package Rajesh_Sir_Problems;

import java.util.Scanner;

// A class to check if a three-digit integer number is palindromic
class PalindromicNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a three-digit integer number
        System.out.print("Enter Three Digit Integer Number: ");
        int number = scanner.nextInt();

        // Check if the entered number is palindromic and print the result
        if (isPalindromic(number)) {
            System.out.println("The given number is Palindromic!");
        } else {
            System.out.println("The given number is not palindromic!");
        }

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }

    // A method to check if a number is palindromic
    public static boolean isPalindromic(int number) {
        // Store the original number
        int originalNumber = number;

        // Initialize a variable to store the reverse of the number
        int reverseNumber = 0;

        // Reverse the number
        while (number != 0) {
            reverseNumber = reverseNumber * 10 + (number % 10);
            number /= 10;
        }

        // Check if the original number is equal to its reverse
        return originalNumber == reverseNumber;
    }
}