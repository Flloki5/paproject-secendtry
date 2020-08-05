package codecool.dao;

import codecool.model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
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
            st.setLong(1, book.getISBN());
            st.setInt(2, book.getAuthor_id());
            st.setString(3, book.getTitle());
            st.setString(4, book.getPublisher_id());
            st.setInt(5, book.getPublication_year());
            st.setDouble(6, book.getPrice());
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

        List<Book> booksList = new LinkedList<>();

        String sql = "SELECT * FROM books;";
        try(PreparedStatement st = conn.prepareStatement(sql)){
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                long ISBN = rs.getLong("ISBN");
                int authorId = rs.getInt("author_id");
                String title = rs.getString("title");
                String publisherId = rs.getString("publisher_id");
                int publicationYear = rs.getInt("publication_year");
                double price = rs.getDouble("price");
                booksList.add(new Book(ISBN, authorId, title, publisherId, publicationYear, price));
            }

        }catch (SQLException e) {
            System.out.println("Error executing query: " + e.getMessage());
        }
        return booksList;
    }
}
