import java.util.InputMismatchException;
import java.util.Scanner;

import MainMenu.mainMenu;

public class consoleMain {
    public static void main(String[] args) throws InputMismatchException {
        System.out.println("-----Bus Ticket Booking-----");
        System.out.println("1. Enter ticket booking console");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");
        try {
            try (Scanner sc = new Scanner(System.in)) {
                int choice = sc.nextInt();
                boolean flagLoop = true;

                while (flagLoop) {
                    switch (choice) {
                        case 1:
                            mainMenu.menu();
                            flagLoop = false;
                            break;
                        case 2:
                            flagLoop = false;
                            break;
                        default:
                            flagLoop = false;
                            break;
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invaild Input " + e);
        }
    }
}