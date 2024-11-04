import java.util.Date;

public class Book {
    private int id;
    private String title;
    private String author;
    private Date registerDate;
    private boolean available;
    private Date attDate;

    public Livro(int id, String title, String author, Date registerDate, boolean available, Date attDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.registerDate = new Date();
        this.availible = true;
        this.attDate = new Date();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public Date getAttDate() {
        return attDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setAttDate(Date AttDate) {
        this.attDate = attDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author +
                ", registerDate=" + registerDate +
                ", available=" + available +
                ", attDate=" + attDate +
                '}';
    }
}
