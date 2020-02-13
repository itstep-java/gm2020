package org.itstep.msk.lesson3;

/**
 * Инкапсуляция - возможность объединения свойств и методов объектов в один класс
 * Так же управление доступом к свойствам и методам является частью инкапсуляции
 */
public class Table extends Furniture {
    // Свойства класса
    public int width;
    public int height;
    public int length;

    public Table(String color) {
        super(color);
    }

    // Методы класса
    public void expand(int force) {
        if (force > 100) {
            System.out.println(getColor() + " стол сломался");
        }

        System.out.println(getColor() + " стол разложили");
    }

    @Override
    public void open() {
        System.out.println("Стол открыт");
    }
}
