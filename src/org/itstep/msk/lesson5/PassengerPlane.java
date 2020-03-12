package org.itstep.msk.lesson5;

public abstract class PassengerPlane extends Airplane implements PassengerTransport {
    protected int passengers;

    // Наличие этого метода требует интерфейс PassengerTransport
    @Override
    public int getPassengers() {
        return passengers;
    }

    // Наличие этого метода требует интерфейс PassengerTransport
    @Override
    public String getReadablePassengers(String postfix) {
        return passengers + " " + postfix;
    }
}
