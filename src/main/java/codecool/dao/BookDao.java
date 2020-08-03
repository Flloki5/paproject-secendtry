package codecool.dao;

import codecool.model.Book;

import java.util.List;

public interface BookDao {

    void add(Book book);

    void delete(int bookId);

    void edit(Book book, int book_id);

    List<Book> getBooksList();
}
