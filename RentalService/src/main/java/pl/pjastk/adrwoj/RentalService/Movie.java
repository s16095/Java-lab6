package pl.pjastk.adrwoj.RentalService;

public class Movie {

    private Long id;
    private String name;
    private EnumMovie category;
    private String author;
    private boolean isAvailable;

    public Movie(Long id, String name, EnumMovie category, String author) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.author = author;
        this.isAvailable = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumMovie getCategory() {
        return category;
    }

    public void setCategory(EnumMovie category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
