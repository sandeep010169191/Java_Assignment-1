package Function;

import java.util.Scanner;

public class printBus {
    public static void printBusTicket(int busChoice, Bus[] arrBus, String boardPoint, String destPoint) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out
                    .println("\nYou have selected Bus " + busChoice + " from " + boardPoint + " to " + destPoint);
            System.out.println("\nEnter your details below- ");
            System.out.print("Enter your name: ");
            String passengerName = sc.nextLine();
            System.out.print("Enter your age: ");
            int passengerAge = sc.nextInt();
            System.out.print("Enter Date of Journey (1/1/2020): ");
            String doj = sc.next();
            System.out.println("Thank You for Booking with Us\n*****Here is your ticket*****");
            switch (busChoice) {
                case 1:
                    System.out.print("Name: " + passengerName + "\nAge: " + passengerAge + "\nDate of Journey: " + doj
                            + "\nBus Number: " + busChoice + "\nFrom: " + boardPoint + "\nTo: " + destPoint
                            + "\nTotal Fare: Rs." + arrBus[0].busFare);
                    break;
                case 2:
                    System.out.print("Name: " + passengerName + "\nAge: " + passengerAge + "\nDate of Journey: " + doj
                            + "\nBus Number: " + busChoice + "\nFrom: " + boardPoint + "\nTo: " + destPoint
                            + "\nTotal Fare: Rs." + arrBus[1].busFare);
                    break;
                case 3:
                    System.out.print("Name: " + passengerName + "\nAge: " + passengerAge + "\nDate of Journey: " + doj
                            + "\nBus Number: " + busChoice + "\nFrom: " + boardPoint + "\nTo: " + destPoint
                            + "\nTotal Fare: Rs." + arrBus[2].busFare);
                    break;
                default:
                    break;
            }
        }
    }
}
