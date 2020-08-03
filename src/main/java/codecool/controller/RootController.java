package codecool.controller;

import codecool.dao.BookDao;
import codecool.model.Book;
import codecool.view.MainView;

import java.sql.Connection;

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
                    //bookDao.add(Book book);
                    break;
                case 2:
                    //bookDao.edit();
                    break;
                case 3:
                    //bookDao.delete();
                    break;
                case 4:
                    //bookDao.getBooksList();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
            }
        }
    }
}
