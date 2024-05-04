package Rajesh_Sir_Problems;

import java.util.Arrays;
import java.util.Scanner;

// A class to sort three numbers in ascending order
class SortNumbersInAscendingOrder {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the First Number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the Second Number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the Third Number: ");
        int thirdNumber = scanner.nextInt();

        // Create an array to store the three numbers
        int[] numbers = {firstNumber, secondNumber, thirdNumber};

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the sorted numbers
        System.out.println("Numbers in Ascending Order are: " + Arrays.toString(numbers));

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}