package Rajesh_Sir_Problems;

import java.util.Scanner;

class MinimumValueFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        // Prompt the user to enter ten numbers
        System.out.println("Enter ten numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Find the minimum value among the entered numbers
        double min = findMinimum(numbers);

        // Display the minimum value
        System.out.println("The minimum value is: " + min);

        scanner.close();
    }

    // Method to find the minimum value in an array of doubles
    public static double findMinimum(double[] numbers) {
        double min = numbers[0]; // Initialize min with the first element of the array

        // Iterate through the array to find the minimum value
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }
}