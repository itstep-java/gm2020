package org.itstep.msk.lesson1;

import java.util.Scanner;

/**
 * Урок 1. Типы данных. Составные операторы if и switch
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1,4,5-красный, 2,6-зеленый, 3,7,8-синий");
        System.out.print("Введите номер цвета: ");
        int colorNumber = scanner.nextInt();

        switch (colorNumber) {
            case 1:
            case 4:
            case 5:
                System.out.println("КРАСНЫЙ");
                break;
            case 2:
            case 6:
                System.out.println("ЗЕЛЕНЫЙ");
                break;
            case 3:
            case 7:
            case 8:
                System.out.println("СИНИЙ");
                break;
            default:
                System.out.println("Некорректный цвет!");
                break;
        }

        if (colorNumber == 7) {
            System.out.println("Счастливое число :)");
        }

        // Вызов задачи с индексом максимального значения в массиве
        indexOfMax();
    }

    public static void demo() {
        // Примитивные типы
        byte by;   // 1 байт
        short s;   // 2 байта
        int i = 0; // 4 байта
        long l;    // 8 байт

        float f;  // 4 байта
        double d; // 8 байт

        boolean b; // true или false

        char c; // символ (2 байта)

        // Ссылочные типы

        // Типы-обертки
        Byte by1;
        Short s1;
        Integer i1 = 1;
        Long l1;

        Float f1;
        Double d1;

        Boolean b1;

        Character c1;

        // и другие...
        String str; // Строка (массив символов)
        int[] ints; // Массивы тоже объекты!
        Integer[] ints1;
        int[][] matrix;
        // Любые классы, которые написаны разработчиками

        // Логические операции:
        // >, <, >=, <=, ==, !=, &, && (и), |, || (или), ! (отрицание)
        // (a < b) & (b++ > c)   (a < b) && (b++ > c)

        // Условный оператор
        if (i < 10) {
            // Если выражение истинное
        } else { // Ответвление else опциональное (можно не писать)
            // Если выражение ложное

            if (i > 1) { // Вложенный if
                // ...
            }
        }

        switch (i) {
            case 0:
                // Что-то делаю, если i = 0
                break;
            case 10:
                // Делаю что-то другое, если i = 10
                break;
            default:
                // Выполняю дефолтный код, если предыдущие кейсы не совпали
                break;
        }
    }

    /**
     * Найти индекс максимального значения из массива
     */
    public static void indexOfMax() {
        int[] array = {10, 115, 4, 7, 8, 3, 17, 22};

        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }

        System.out.println(index);
    }
}
