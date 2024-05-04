package Rajesh_Sir_Problems;

import java.util.Scanner;

// A class to calculate the average value of elements in arrays
class CalculateAverageValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input and calculate average for the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.print("Enter elements of the first array (separated by spaces): ");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        double average1 = calcAverage(array1);
        System.out.println("The average value of the first array is: " + average1);

        // Input and calculate average for the second array
        System.out.print("\nEnter the size of the second array: ");
        int size2 = scanner.nextInt();
        double[] array2 = new double[size2];
        System.out.print("Enter elements of the second array (separated by spaces): ");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextDouble();
        }
        double average2 = calcAverage(array2);
        System.out.println("The average value of the second array is: " + average2);

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }

    // A method to calculate the average value of integer elements in an array
    public static int calcAverage(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum / array.length;
    }

    // A method to calculate the average value of double elements in an array
    public static double calcAverage(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum / array.length;
    }
}