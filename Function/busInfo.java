package Function;

import java.util.Scanner;

class Bus {
    String busName;
    int busFare;
    int busId;
}

public class busInfo {
    public static void availableBus(String boardringPoint, String destinationPoint) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nTotal 3 buses available from " + boardringPoint + " to " + destinationPoint + ":");

            Bus bus1 = new Bus();
            bus1.busName = "Anand Special";
            bus1.busFare = 1000;
            bus1.busId = 1;

            Bus bus2 = new Bus();
            bus2.busName = "Super Rocket Service";
            bus2.busFare = 1500;
            bus2.busId = 2;

            Bus bus3 = new Bus();
            bus3.busName = "Road King";
            bus3.busFare = 2000;
            bus3.busId = 3;

            Bus arrBus[] = new Bus[3];
            arrBus[0] = bus1;
            arrBus[1] = bus2;
            arrBus[2] = bus3;

            for (Bus bus : arrBus) {
                System.out.println(bus.busId + ". " + bus.busName + " -> Rs." + bus.busFare);
            }

            System.out.print("\nWhich bus you want to select? ");
            int busChoice = sc.nextInt();
            printBus.printBusTicket(busChoice, arrBus, boardringPoint, destinationPoint);
        }
    }
}
