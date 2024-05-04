package Rajesh_Sir_Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ArrayListComparison {
    public static void main(String[] args) {
        // Create two ArrayLists
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements for the first list
        System.out.print("Enter the number of elements for the first list: ");
        int n1 = scanner.nextInt();

        // Prompt the user to enter the elements for the first list
        System.out.println("Enter the elements for the first list:");
        for (int i = 0; i < n1; i++) {
            list1.add(scanner.nextInt());
        }

        // Prompt the user to enter the number of elements for the second list
        System.out.print("Enter the number of elements for the second list: ");
        int n2 = scanner.nextInt();

        // Prompt the user to enter the elements for the second list
        System.out.println("Enter the elements for the second list:");
        for (int i = 0; i < n2; i++) {
            list2.add(scanner.nextInt());
        }
    
        // Compare the two ArrayLists
        boolean areEqual = compareArrayLists(list1, list2);

        // Print the result
        if (areEqual) {
            System.out.println("The two ArrayLists are equal.");
        } else {
            System.out.println("The two ArrayLists are not equal.");
        }
    }

    // Method to compare two ArrayLists
    public static boolean compareArrayLists(List<Integer> list1, List<Integer> list2) {
        // Check if the sizes of the two lists are equal
        if (list1.size() != list2.size()) {
            return false;
        }

        // Check if the elements of the two lists are equal
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                return false;
            }
        }

        return true;
    }
}
