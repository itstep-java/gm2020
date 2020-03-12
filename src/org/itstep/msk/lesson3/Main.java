package org.itstep.msk.lesson3;

/**
 * Урок 3. ООП. Инкапсуляция, наследование, абстракция
 */
public class Main {
    public static void main(String[] args) {
        Table table1 = new Table("Желтый");
        table1.height = 82;
        table1.width = 74;
        table1.length = 130;
        int force = 150;
        table1.expand(force);

        TennisTable table2 = new TennisTable("Зеленый");
        table2.setSecondColor("Красный");
        table2.setSecondColor("Оранжевый");
        //...

//        Furniture table3 = new Furniture();
    }
}
