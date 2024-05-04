package Rajesh_Sir_Problems;

import java.util.Scanner;

// A class to calculate the area and perimeter of a circle
class CircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the Radius: ");

        // Read the input radius
        float radius = scanner.nextFloat();

        // Calculate the area of the circle
        double area = Math.PI * radius * radius;

        // Calculate the perimeter of the circle
        double perimeter = 2 * Math.PI * radius;

        // Print the calculated area with two decimal places
        System.out.printf("\nThe Area of Circle is: %.2f\n", area);

        // Print the calculated perimeter with two decimal places
        System.out.printf("The Perimeter of Circle is: %.2f", perimeter);

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}