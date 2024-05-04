package Rajesh_Sir_Problems;

import java.util.Scanner;

// A class to calculate the sum of digits of an integer
class SumOfDigits {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an Integer: ");

        // Read the input integer
        int number = scanner.nextInt();

        // Calculate the sum of digits of the input integer
        int digitSum = calcSumOfIntegerDigits(number);

        // Print the sum of digits
        System.out.println("The Sum of Digits is: " + digitSum);

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }

    // A method to calculate the sum of digits of an integer
    public static int calcSumOfIntegerDigits(int number) {
        int sum = 0;
        while (number != 0) {
            // Extract the last digit of the number and add it to the sum
            sum += (number % 10);

            // Remove the last digit from the number
            number /= 10;
        }
        return sum;
    }
}