package ro.fasttrackit.curs10.classes;

public class Book {
    private String author;
    private int pages;

    public Book (String author, int pages) {
        this.author = author;
        this.pages = pages;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPages(){
        return this.pages;
    }
}
