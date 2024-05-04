package Rajesh_Sir_Problems;

import java.util.Scanner;

class EvenNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is odd
        if (number % 2 != 0) {
            // If the number is odd, throw an IllegalArgumentException
            throw new IllegalArgumentException("The given number '" + number + "' is odd");
        } else {
            // If the number is even, print a message
            System.out.println("The given number '" + number + "' is even");
        }
    }
}