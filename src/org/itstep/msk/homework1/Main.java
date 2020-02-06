package org.itstep.msk.homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Консольный калькулятор");

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.print("Введите команду: ");
            String command = scanner.next();

            if (command.equals("exit")) {
                System.out.println("Выход из калькулятора");
                break;
            }

            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();
            double result = 0;

            switch (command) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Делить на ноль нельзя!");
                        continue;
                    }

                    result = num1 / (double) num2;
                    break;
                default:
                    System.out.println("Неверная команда");
                    continue;
            }

            System.out.println("Результат: " + result);
        } while (true);
    }
}
