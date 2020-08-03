package codecool.view;

public class MainView {

    public void printMenu() {
        String[] options = {"Add", "Edit", "Delete", "Print", "Exit"};
        for (int i = 0; i < options.length; i++) {
            System.out.println("  " + (i + 1) + ". " + options[i]);
        }
        System.out.println();
    }
}
