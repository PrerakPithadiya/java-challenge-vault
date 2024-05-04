package Rajesh_Sir_Problems;

import java.util.Scanner;

// A class to print the table of a given number
class TablePrinter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the Number: ");

        // Read the input number
        int number = scanner.nextInt();

        // Print a message indicating the start of the table
        System.out.println("\nThe Table is Printed Here:");

        // Loop to print the table of the entered number
        for (int i = 1; i <= number; i++) {
            // Print the current number, its square, and its cube
            System.out.println(i + "  " + (i * i) + "  " + (i * i * i));
        }

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}