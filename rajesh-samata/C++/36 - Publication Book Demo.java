import java.util.Scanner;

class Publication {
    protected String title;
    protected float price;

    public void get_data() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter title: ");
        title = scanner.nextLine();
        System.out.print("Enter price: ");
        price = scanner.nextFloat();
    }

    public void put_data() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

class Book extends Publication {
    private int page_count;

    public void get_data() {
        super.get_data();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter page count: ");
        page_count = scanner.nextInt();
    }

    public void put_data() {
        super.put_data();
        System.out.println("Page count: " + page_count);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[50];

        // Input data for each book
        for (int i = 0; i < 50; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            books[i] = new Book();
            books[i].get_data();
        }

        // Display data for each book
        System.out.println("\nDetails of all books:");
        for (int i = 0; i < 50; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            books[i].put_data();
        }
    }
}
