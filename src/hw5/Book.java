package hw5;

public class Book {
    private String name ;
    private String author;
    private String date;


    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    String getName() {
        return "[Название: " + name + ",автор: " + author + ", дата:" + date +"]";



    }
}
