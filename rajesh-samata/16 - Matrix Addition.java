package Rajesh_Sir_Problems;

import java.util.Arrays;
import java.util.Scanner;

class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the matrices
        System.out.println("Enter the number of rows and columns for the matrices:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Create matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix;

        // Input elements for the first matrix
        System.out.println("\nEnter elements for the first matrix:");
        inputMatrixElements(scanner, matrix1);

        // Input elements for the second matrix
        System.out.println("\nEnter elements for the second matrix:");
        inputMatrixElements(scanner, matrix2);

        // Perform matrix addition
        sumMatrix = addMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("\nSum of the matrices:");
        displayMatrix(sumMatrix);

        scanner.close();
    }

    // Method to input elements of a matrix
    public static void inputMatrixElements(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sumMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sumMatrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}