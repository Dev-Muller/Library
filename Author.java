import java.util.Date;

public class Author {
    private int id;
    private String name;
    private Date birthDate;

    public Autor(int id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Autor(" +
        "id=" + id +
        ", name=" + name +
        ", birthDate=" + birthDate +
        ')';
    }
}