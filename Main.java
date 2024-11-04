import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        //add authors
        Author author1 = new Author(1, "J.K. Rowling", new Date());
        Author author2 = new Author(2, "J.R.R. Tolkien", new Date());

        library.addAuthor(author1);
        library.addAuthor(author2);

        //add books
        Book book1 = new Book(1, "Harry Potter and the Philosopher's Stone", author1);
        Book book2 = new Book(2, "The Lord of the Rings: The ring society", author2);
        Book book3 = new Book(3, "Harry Potter and the Secret Chamber", author1);

        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);

        // loop for user interaction
        while(true) {
            System.out.println("Would you like to see all the available books? (y/n)");
            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals("y")) {
                List<Book> availableBooks = library.listBooksAvailable();

                if (availableBooks.isEmpty()) {
                    System.out.println("There are no available books.");
                } else {
                    System.out.println("Available books:");
                    for (Book book : availableBooks) {
                        System.out.println(book.getId() + " : " + book.getTitle());
                    }

                    System.out.println("Write the Book Id that you like to borrow:");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();

                    Book selectedBook = library.searchBooksById(bookId);

                    if (selectedBook != null && selectedBook.isAvailable()) {
                        System.out.println("Write your name:");
                        String userName = scanner.nextLine();

                        library.lendingBooks(selectedBook, userName);
                        System.out.println( "The book " + selectedBook.getTitle() + " was borrowed by " + userName);
                    } else {
                        System.out.println("The book is not available.");
                    }

                }
            } else if (answer.equals("n")) {
                System.out.println("Thank you for using the library system!");
                break;
            } else {
                System.out.println("Wrong answer. Please try again.");
            }
        }

        scanner.close();
    }
}
