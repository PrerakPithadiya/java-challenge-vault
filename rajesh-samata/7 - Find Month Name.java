package Rajesh_Sir_Problems;

import java.util.Random;

// A class to find and print a random month
class RandomMonthFinder {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();

        // Generate a random month number (between 1 and 12)
        int monthNumber = random.nextInt(12) + 1;

        // Print the randomly generated month number
        System.out.println("The Random Month Number is: " + monthNumber);

        // Find the month name corresponding to the generated month number
        String monthName = findMonthName(monthNumber);

        // Print the month name
        System.out.println("The Month name is: " + monthName);
    }

    // A method to find the month name based on the month number
    public static String findMonthName(int monthNumber) {
        return switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> null; // Return null for invalid month numbers
        };
    }
}