package codecool.view;

import java.util.Scanner;

public class MainView {

    private final Scanner scanner = new Scanner(System.in);

    public void printMenu() {
        String[] options = {"Add", "Edit", "Delete", "Print", "Exit"};
        for (int i = 0; i < options.length; i++) {
            System.out.println("  " + (i + 1) + ". " + options[i]);
        }
        System.out.println();
    }

    public int getIntegerInput() {
        while(!scanner.hasNextInt()){
            scanner.next();
            System.out.println("\n" + "  Enter integer");
            System.out.print("\033[2C");
        }
        int input = scanner.nextInt();
        scanner.nextLine();

        return input;
    }

    public String getStringInput() {
        while(!scanner.hasNext()){
            scanner.next();
            System.out.println("\n" + "  Enter string");
            System.out.print("\033[2C");
        }
        String input = scanner.next();
        scanner.nextLine();

        return input;
    }
}
