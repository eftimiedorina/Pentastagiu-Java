package Exercice4;

public class Board {
    private String description;
    private String author;

    public Board(String description, String author) {
        this.description = description;
        this.author = author;
    }

    public String message(){
        return "This is a message.";
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }
}
