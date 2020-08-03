package codecool.model;



public class Book {
    private int ISBN;
    private int author_id;
    private String title;
    private int publisher_id;
    private int publication_year;
    private int price;

    public Book(int ISBN, int author_id, String title, int publisher_id, int publication_year, int price) {
        this.ISBN = ISBN;
        this.author_id = author_id;
        this.title = title;
        this.publisher_id = publisher_id;
        this.publication_year = publication_year;
        this.price = price;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public String getTitle() {
        return title;
    }

    public int getPublisher_id() {
        return publisher_id;
    }

    public int getPublication_year() {
        return publication_year;
    }

    public int getPrice() {
        return price;
    }
}

