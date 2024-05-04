package Rajesh_Sir_Problems;

import java.util.Scanner;

// A class to calculate Body Mass Index (BMI)
class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter your weight in pounds: ");

        // Read the input weight in pounds
        double weightInPounds = scanner.nextDouble();

        // Convert weight from pounds to kilograms
        double weightInKilograms = weightInPounds * 0.45359237;

        // Prompt the user to enter height in inches
        System.out.print("Enter your height in inches: ");

        // Read the input height in inches
        double heightInInches = scanner.nextDouble();

        // Convert height from inches to meters
        double heightInMeters = heightInInches * 0.0254;

        // Calculate BMI using the formula: weight / (height * height)
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Print the calculated BMI
        System.out.printf("\nYour Body Mass Index is: %.2f", bmi);

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}