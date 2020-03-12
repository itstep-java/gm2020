package org.itstep.msk.lesson5;

public class BMW extends PassengerCar {
    public BMW(String name, long cost, int passengers, int speed) {
        autopilot = false;
        category = "Легковой автомобиль BMW";
        this.name = name;
        this.cost = cost;
        this.passengers = passengers;
        this.speed = speed;
    }
}
