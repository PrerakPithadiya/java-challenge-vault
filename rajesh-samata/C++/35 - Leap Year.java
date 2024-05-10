public class LeapYear {
    // Method to check if the given year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4, but not by 100 unless it's also divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        // Test cases
        int year1 = 2020;
        int year2 = 2021;

        // Check if year1 is a leap year
        if (isLeapYear(year1)) {
            System.out.println(year1 + " is a leap year.");
        } else {
            System.out.println(year1 + " is not a leap year.");
        }

        // Check if year2 is a leap year
        if (isLeapYear(year2)) {
            System.out.println(year2 + " is a leap year.");
        } else {
            System.out.println(year2 + " is not a leap year.");
        }
    }
}
