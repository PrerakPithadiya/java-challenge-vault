package Rajesh_Sir_Problems;

import java.util.*;

class UniqueIntegerChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        System.out.println("Enter the integers:");
        List<Integer> numbers = new ArrayList<>();

        // Reading integers from the user
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Checking for duplicates
        Set<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (set.contains(num)) {
                System.out.println("Duplicate number found: " + num);
                throw new IllegalArgumentException("Duplicate number found: " + num);
            } else {
                set.add(num);
            }
        }

        System.out.println("All numbers are unique.");
    }
}
