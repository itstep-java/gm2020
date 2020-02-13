package org.itstep.msk.lesson3;

/**
 * Абстрактный класс - это возможность вынести самые общие свойства и методы
 * в один базовый класс. При этом создать объект на основе
 * абстрактного класса запрещается
 */
public abstract class Furniture {
    private String color;

    public Furniture(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    abstract public void open();
}
