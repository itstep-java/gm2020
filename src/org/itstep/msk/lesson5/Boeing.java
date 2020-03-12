package org.itstep.msk.lesson5;

public class Boeing extends PassengerPlane {
    public Boeing(String name, long cost, int passengers, int speed, int wingspan) {
        autopilot = true;
        category = "Пассажирский самолет Boeing";
        this.name = name;
        this.cost = cost;
        this.passengers = passengers;
        this.speed = speed;
        this.wingspan = wingspan;
    }
}
