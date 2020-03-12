package org.itstep.msk.lesson5;

/**
 * Урок 5. Интерфейсы
 */
public class Main {
    public static void main(String[] args) {
        Boeing boeing737 = new Boeing("Boeing 737", 4000000000L, 280, 990, 54);
        Boeing boeing777 = new Boeing("Boeing 777", 6500000000L, 490, 1010, 57);
        BMW bmwx5 = new BMW("MBW X5", 3000000, 3, 360);

        printPassengerTransport(boeing737);
        printPassengerTransport(boeing777);
        printPassengerTransport(bmwx5);

        System.out.println(
                bmwx5.getReadablePassengers("пассажиров")
        );
    }

    /**
     * Данный метод работает не с конкретным классом, а с интерфейсом пассажирского транспорта!
     */
    private static void printPassengerTransport(PassengerTransport transport) {
        System.out.println(
                transport.getName() + " - " + transport.getPassengers()
        );
    }
}
