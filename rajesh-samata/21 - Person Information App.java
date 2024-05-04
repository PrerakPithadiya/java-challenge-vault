package Rajesh_Sir_Problems;

// Defining a Person class to represent individuals
class Person {
    // Instance variables to store person's details
    private String fullName;
    private int age;
    private String country;

    // Method to set the person's full name
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // Method to set the person's age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to set the person's country
    public void setCountry(String country) {
        this.country = country;
    }

    // Method to get the person's full name
    public String getFullName() {
        return this.fullName;
    }

    // Method to get the person's age
    public int getAge() {
        return this.age;
    }

    // Method to get the person's country
    public String getCountry() {
        return this.country;
    }
}

// Main class to demonstrate usage of Person class
class PersonInformationApp {
    public static void main(String[] args) {
        // Creating an instance of Person class
        Person person = new Person();

        // Setting details for the person
        person.setFullName("Prerak Pithadiya");
        person.setAge(18);
        person.setCountry("India");

        // Printing person's details with descriptive messages
        System.out.println("Person's Full Name: " + person.getFullName());
        System.out.println("Person's Age: " + person.getAge() + " years");
        System.out.println("Person's Country of Residence: " + person.getCountry());
    }
}