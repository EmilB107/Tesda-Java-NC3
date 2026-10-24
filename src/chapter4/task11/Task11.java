/*
    Task: Create a Java class to represent a Book and implement a constructor to initialize its attributes.
    Instructions:
    Create a new Java class called "Book" with the following attributes:
    String title
    String author
    int yearPublished
    double price
    Implement a constructor in the Book class that takes four parameters corresponding to the attributes and initializes them.
    Create a main method in a separate class to test the constructor:
    Instantiate three Book objects with different values using the constructor.
    Print out the details of each book (title, author, yearPublished, and price) using toString().

    Example Output:
    Book 1:
    Title: "Java Programming"
    Author: "John Smith"
    Year Published: 2021
    Price: $39.99

    Book 2:
    Title: "Python Basics"
    Author: "Jane Doe"
    Year Published: 2020
    Price: $29.99

    Book 3:
    Title: "C++ Essentials"
    Author: "Michael Johnson"
    Year Published: 2019
    Price: $49.99
*/
package chapter4.task11;

public class Task11 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        System.out.println("Book 1:\n" + book1.toString() + "\n");
        System.out.println("Book 2:\n" + book2.toString() + "\n");
        System.out.println("Book 3:\n" + book3.toString() + "\n");
    }
}

class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: $" + price;
    }
}