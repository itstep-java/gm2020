package org.itstep.msk.lesson5;

public abstract class Transport {
    protected long cost;
    protected int speed;
    protected String category;
    protected boolean autopilot = false;
    protected String name;

    public long getCost() {
        return cost;
    }

    public int getSpeed() {
        return speed;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAutopilot() {
        return autopilot;
    }

    // Наличие этого метода требует интерфейс PassengerTransport
    public String getName() {
        return name;
    }
}
