package codecool.model;


public class Book {
    private long ISBN;
    private int author_id;
    private String title;
    private String publisher_id;
    private int publication_year;
    private double price;

    public Book(long ISBN, int author_id, String title, String publisher_id, int publication_year, double price) {
        this.ISBN = ISBN;
        this.author_id = author_id;
        this.title = title;
        this.publisher_id = publisher_id;
        this.publication_year = publication_year;
        this.price = price;
    }

    public long getISBN() {
        return ISBN;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher_id() {
        return publisher_id;
    }

    public int getPublication_year() {
        return publication_year;
    }

    public double getPrice() {
        return price;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher_id(String publisher_id) {
        this.publisher_id = publisher_id;
    }

    public void setPublication_year(int publication_year) {
        this.publication_year = publication_year;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

