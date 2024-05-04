package Rajesh_Sir_Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ColorInputApp {
    public static void main(String[] args) {
        // Create a list to store colors
        List<String> colorList = new ArrayList<>();

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of colors
        System.out.print("Enter the number of colors: ");
        int numberOfColors = scanner.nextInt();

        // Prompt the user to enter the colors
        System.out.println("Enter the colors:");
        for (int i = 0; i < numberOfColors; i++) {
            String color = scanner.next();
            colorList.add(color);
        }

        // Print the colors entered by the user
        System.out.println("The colors entered are: " + colorList);
    }
}