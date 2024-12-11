package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("Great EXpectations", "Charles Dickens", 2000));
        library.addBook(new Book("Data Structures", "Williams Davids", 2004));

        // List all books
        System.out.println("Books in the library:");
        library.listBooks();

        // Create a patron
        Patron patron = new Patron("Kofi", 1);

        // Borrow a book
        patron.borrowBook(new Book("Data Structures", "Williams Davids", 2004), library);

        // List borrowed books
        System.out.println("\nBorrowed books:");
        patron.listBorrowedBooks();

        // Return a book
        patron.returnBook(new Book("Data Structures", "Williams Davids", 2004), library);

        // Final library state
        System.out.println("\nBooks in the library after operations:");
        library.listBooks();
    }
}