package Exercice3;

public class Book extends Product {
    private String author,description;

    public Book(int id, double price, String name, String author) {
        super(id, price, name);
        this.author = author;
        this.description = description;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }
}
