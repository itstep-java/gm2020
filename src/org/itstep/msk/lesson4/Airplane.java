package org.itstep.msk.lesson4;

/*
Инкапсуляция - возможность объединить свойства и действия
какой-либо информации в класс (с полями и методами)
Абстракция - объединение общего в один класс,
при этом создание объектов на основе этого класса запрещено - слишком уж он абстрактен
 */
public abstract class Airplane {
    private String brand;

    public Airplane(String brand) {
        this.brand = brand;
    }

    public abstract void takeoff(int height);

    public String getBrand() {
        return brand;
    }
}
