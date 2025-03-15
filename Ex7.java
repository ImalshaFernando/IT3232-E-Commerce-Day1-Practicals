/*7) Implement classes for a library
here are different types of books are available in the library like printed books, E books and Audio books
you must use inheritance, polymorphism, encapsulation */

import java.util.ArrayList;

// Base class
abstract class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayInfo();
}

// Subclass for Printed Books
class PrintedBook extends Book {
    private int pages;

    public PrintedBook(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    @Override
    public void displayInfo() {
        System.out.println("Printed Book: " + getTitle() + " by " + getAuthor() + ", Pages: " + pages);
    }
}

// Subclass for E-Books
class EBook extends Book {
    private double fileSize;

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("E-Book: " + getTitle() + " by " + getAuthor() + ", File Size: " + fileSize + "MB");
    }
}

// Subclass for Audio Books
class AudioBook extends Book {
    private double duration;

    public AudioBook(String title, String author, double duration) {
        super(title, author);
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.println("Audio Book: " + getTitle() + " by " + getAuthor() + ", Duration: " + duration + " hours");
    }
}

// Library Class to manage books
class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            book.displayInfo();
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new PrintedBook("The Great Gatsby", "F. Scott Fitzgerald", 180));
        library.addBook(new EBook("1984", "George Orwell", 1.5));
        library.addBook(new AudioBook("Becoming", "Michelle Obama", 19.5));

        library.displayBooks();
    }
}
