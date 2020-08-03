package codecool.dao;

import codecool.model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PSQLBookDao implements BookDao {

    Connection conn;

    public PSQLBookDao(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int add(Book book) {
        String sql = "INSERT INTO books (ISBN, author_id, title, publisher_id, publisher_year, price) VALUES (?, ?, ?, ?, ?, ?)";
        try(PreparedStatement st = conn.prepareStatement(sql)) {
            st.setInt(1, book.getISBN());
            st.setInt(2, book.getAuthor_id());
            st.setString(3, book.getTitle());
            st.setInt(4, book.getPublisher_id());
            st.setInt(5, book.getPublication_year());
            st.setInt(6, book.getPrice());
            return st.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error executing query: " + e.getMessage());
        }
        return 0;
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
