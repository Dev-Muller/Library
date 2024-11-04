import java.util.Date;

public class Lending {
    private int id;
    private static int idCounter = 1;
    private Book book;
    private String userName;
    private Date lendingDate;
    private Date devolutuinDate;
    private boolean active;

    public Lending(Book book, String userName) {
        this.id = idCounter++;
        this.book = book;
        this.userName = userName;
        this.lendingDate = new Date();
        this.active = true;
    }

    public int getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public String getUserName() {
        return userName;
    }

    public Date getLendingDate() {
        return lendingDate;
    }

    public Date getDevolutuinDate() {
        return devolutuinDate;
    }

    public boolean isActive() {
        return active;
    }

    public void devolutionBooks() {
        this.active = false;
        this.devolutuinDate = new Date();
        this.book.setAvailable(true);
    }

    @Override
    public String toString() {
        return "Lending(" +
        "id=" + id +
        ", book=" + book +
        ", userName=" + userName +
        ", lendingDate=" + lendingDate +
        ", devolutuinDate=" + devolutuinDate +
        ", active=" + active +
        ')';
    }
}

