package org.itstep.msk.lesson3;

/**
 * Наследование:
 * Теннисный стол наследует все возможности обычного стола
 */
public class TennisTable extends Table {
    protected String secondColor = "Черный";

    public TennisTable(String color) {
        super(color);
    }

    public void play() {
        System.out.println("Играем в теннис: " + getColor());
    }

    // Геттер
    public String getSecondColor() {
        return this.secondColor;
    }

    // Сеттер
    public void setSecondColor(String color) {
        if (color.length() == 0) {
            return;
        }

        this.secondColor = color;
    }
}
