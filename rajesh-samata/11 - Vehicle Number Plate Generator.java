package Rajesh_Sir_Problems;

import java.util.Random;

// A class to generate a random vehicle number plate
class VehicleNumberPlateGenerator {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();

        // Define strings for uppercase letters and digits
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";

        // Get the length of the strings
        int lettersLength = letters.length();
        int digitsLength = digits.length();

        // StringBuilder to build the number plate
        StringBuilder numberPlate = new StringBuilder();

        // Generate three random uppercase letters
        for (int i = 0; i < 3; i++) {
            numberPlate.append(letters.charAt(random.nextInt(lettersLength)));
        }

        // Generate four random digits
        for (int i = 0; i < 4; i++) {
            numberPlate.append(digits.charAt(random.nextInt(digitsLength)));
        }

        // Print the generated vehicle number plate
        System.out.println("Vehicle Number Plate is: " + numberPlate);
    }
}