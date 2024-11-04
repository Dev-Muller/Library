import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();
    private List<Lending> lendings = new ArrayList<>();

    // Methods for books
    public void addBooks(Book book) {
        books.add(book);
    }

    public List<Book> listBooks() {
        return books;
    }

    public void removeBooks(int id) {
        books.removeIf(books -> books.getId() == id);
    }

    public List<Book> listBooksAvailable() {
        List<Book> BooksAvailable = new ArrayList<>();
        for (Book books : books) {
            if (books.isAvailable()) {
                BooksAvailable.add(books);
            }
        }
        return BooksAvailable;
    }

    public Book searchBooksById(int id) {
        for (Book books : books) {
            if (books.getId() == id) {
                return books;
            }
        }
        return null;
    }

    public void atualizarBooks(int id, String newTitle) {
        for (Book books : books) {
            if (books.getId() == id) {
                books.setTitle(newTitle);
                break;
            }
        }
    }

    // Methods for authors
    public void addAuthor(Author author) {
        authors.add(author);
    }
    
    public void removeAuthor(Author author) {
        authors.removeIf(author1 -> author1.getId() == author.getId());
    }

    public List<Author> listAuthors() {
        return authors;
    }

    public void attAuthor(int id, String newName) {
        for (Author author : authors) {
            if (author.getId() == id) {
                author.setName(newName);
                break;
            }
        }
    }

    // Methods for lendings
    public void lendingBooks(Book books, String userName) {
        if (books.isAvailable()) {
            Lending lending = new Lending(books, userName);
            lendings.add(lending);
            books.setAvailable(false);
        } else {
            System.out.println("Book is unavailable");
        }
    }

    public void devolutionBooks(int id) {
        for (Lending lending : lendings) {
            if (lending.getId() == id) {
                lending.devolutionBooks();
                break;
            }
        }
    }

    public List<Lending> lendingsList() {
        return lendings;
    }
}
