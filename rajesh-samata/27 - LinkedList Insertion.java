package Rajesh_Sir_Problems;

import java.util.LinkedList;
import java.util.Scanner;

class LinkedListInsertion {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Add some elements to the LinkedList
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        // Display the original LinkedList
        System.out.println("Original LinkedList: " + linkedList);

        // Prompt the user to enter the element and position to insert
        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();
        System.out.print("Enter the position to insert: ");
        int position = scanner.nextInt();

        // Insert the element at the specified position
        if (position >= 0 && position <= linkedList.size()) {
            linkedList.add(position, element);
            System.out.println("Element " + element + " inserted at position " + position);
        } else {
            System.out.println("Invalid position! Position should be between 0 and " + linkedList.size());
        }

        // Display the modified LinkedList
        System.out.println("Modified LinkedList: " + linkedList);
    }
}