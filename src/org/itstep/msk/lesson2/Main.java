package org.itstep.msk.lesson2;

/**
 * Урок 2. Массивы
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] result = new int[7];

        // Обход массива слева направо
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

        // Обход массива справа налево
        for (int index = array.length - 1; index >= 0; index--) {
            System.out.println(array[index]);
        }

        // "Разворачивание" массива
        for (int index = 0; index < array.length; index++) {
            result[result.length - index - 1] = array[index];
        }

        int a = 13;
        // % - операция вычисления остатка от деления
        if (a % 2 == 0) {
            System.out.println("Число a - четное");
        }

        // Вывод удвоенных значений только в четных индексах
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i] * 2);
            }
        }

        // Найти максимальное и минимальное значение в массиве
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            // Если значение массива оказалось больше, чем max
            if (max < array[i]) {
                // то именно это значение и кладем в max
                max = array[i];
            }
            // Если значение массива оказалось меньше, чем min
            if (min > array[i]) {
                // то именно это значение и кладем в min
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        int[] b = {1, 2, 3, 1, 2, 4, 1};
        int[] c = new int[b.length];

        for (int i = 0; i < b.length; i++) {
            int value = b[i];
            int count = 0;

            for (int j = 0; j < b.length; j++) {
                if (b[j] == value) {
                    count++;
                }
            }

            c[i] = count;
        }

        max = c[0];
        for (int i = 0; i < c.length; i++) {
            if (max < c[i]) {
                max = c[i];
            }
        }

        // b = 1, 2, 3, 1, 2, 4, 1
        // c = 3, 2, 1, 3, 2, 1, 3
        // max = 3
        for (int i = 0; i < c.length; i++) {
            if (c[i] == max) {
                System.out.println(b[i]);
                break;
            }
        }
    }

    public static void demo() {
        int[] array = {1, 3, 67, 35, 7};
        int[] array2 = new int[5];
        array2[0] = 1;
        array2[1] = 3;
        array2[2] = 67;
        array2[3] = 35;
        array2[4] = 7;

        int[][] matrix = {
                {1, 2},
                {},
                {12, 578},
                {5, 78, 45, 234}
        };
        String[][][] space = {
                {
                    {"1", "2"},
                    {"3", "4"}
                },
                {
                    {"5"},
                    {"78", "354"}
                }
        };
        space[0][1][1] = "7"; // 4 -> 7
        String[]  [] space2[] = {};
        String[] space3[][] = {};
        int a[] = {};
        int[] b = {};
    }
}
