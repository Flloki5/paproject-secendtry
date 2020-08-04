package codecool.controller;

import codecool.dao.BookDao;
import codecool.model.Book;
import codecool.view.MainView;

import java.sql.Connection;
import java.util.List;

public class RootController {

    private final MainView mainView;
    private final BookDao bookDao;
    private final Connection conn;


    public RootController(BookDao bookDao, Connection conn) {
        this.bookDao = bookDao;
        this.conn = conn;
        mainView = new MainView();
    }

    public void run() {
        boolean isRunning = true;

        while (isRunning) {

            mainView.printMenu();
            int input = mainView.getIntegerInput();

            switch(input) {
                case 1:
                    bookDao.add(addBook());
                    break;
                case 2:
                    //bookDao.edit();
                    break;
                case 3:
                    //bookDao.delete();
                    break;
                case 4:
                    List<Book> bookList = bookDao.getBooksList();
                    for (Book element: bookList) {
                        System.out.println(element.getISBN() + " " + element.getAuthor_id() + " " + element.getPublication_year() + " " + element.getPrice() + " " + element.getTitle());
                    }
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
            }
        }
    }

    public Book addBook(){
        int ISBN = mainView.getIntegerInput();
        int author_id = mainView.getIntegerInput();
        String title = mainView.getStringInput();
        String publisher_id = mainView.getStringInput();
        int publication_year = mainView.getIntegerInput();
        int price = mainView.getIntegerInput();

        return new Book(ISBN, author_id, title, publisher_id, publication_year, price);
    }
}
