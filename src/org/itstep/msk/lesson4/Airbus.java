package org.itstep.msk.lesson4;

public class Airbus extends Airplane {
    public Airbus() {
        super("Airbus");
    }

    @Override
    public void takeoff(int height) {
        System.out.println(
                "Airbus поднялся на высоту " + height + " метров"
        );
    }
}
