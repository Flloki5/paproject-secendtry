package codecool.dao;

import codecool.model.Book;

import java.sql.Connection;
import java.util.List;

public class PSQLBookDao implements BookDao {

    Connection conn;

    public PSQLBookDao(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void add(Book book) {

    }

    @Override
    public void delete(int bookId) {

    }

    @Override
    public void edit(Book book, int book_id) {

    }

    @Override
    public List<Book> getBooksList() {
        return null;
    }
}
