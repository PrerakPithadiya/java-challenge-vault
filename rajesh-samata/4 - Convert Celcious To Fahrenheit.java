package Rajesh_Sir_Problems;

import java.util.Scanner;

// A class to convert Celsius to Fahrenheit
class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the Celsius value
        System.out.print("Enter the Celsius Value: ");

        // Read the input Celsius value
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        // Print the converted Fahrenheit value
        System.out.println("The Fahrenheit value is: " + fahrenheit);

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}