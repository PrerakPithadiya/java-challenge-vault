package Rajesh_Sir_Problems;

import java.util.HashSet;

class HashSetEmptyTest {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Check if the HashSet is empty
        if (set.isEmpty()) {
            System.out.println("HashSet is empty.");
        } else {
            System.out.println("HashSet is not empty.");
        }

        // Add some elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Check again if the HashSet is empty
        if (set.isEmpty()) {
            System.out.println("HashSet is empty.");
        } else {
            System.out.println("HashSet is not empty.");
        }
    }
}
