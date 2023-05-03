package MainMenu;

import java.util.Scanner;
import Function.busInfo;

public class mainMenu {
    public static String boardingPoint, destPoint;

    public static void menu() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter your BOARDING Point: ");
            boardingPoint = sc.nextLine();

            System.out.print("Enter your DESTINATION: ");
            destPoint = sc.nextLine();

            busInfo.availableBus(boardingPoint, destPoint);
        }
    }
}
