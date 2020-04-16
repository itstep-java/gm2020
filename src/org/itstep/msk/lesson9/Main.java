package org.itstep.msk.lesson9;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Урок 9. Внутренние и вложенные классы. Map. Исключения
 */
public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;
        Contact c = null;

        try {
            if (b != 0) {
                System.out.println(a / b);
            }
            System.out.println(c.getAddress());
        }
        catch (ArithmeticException exception) {
            System.out.println(
                    "Ошибка деления: " + exception.getMessage()
            );
        }
        catch (NullPointerException exception) {
            System.out.println(
                    "Ошибка вызова метода у объекта: " + exception.getMessage()
            );
        }
        catch (Throwable exception) {
            System.out.println(
                    "Произошла ошибка: " + exception.getMessage()
            );
        }
        finally {
            System.out.println("Конец программы!");
        }

        // checked
        // unchecked RuntimeException

        try {
            throw new RuntimeException("Невалидный возраст");
        } catch (RuntimeException e) {
            System.out.println(
                    "Поймали свое же исключение: " + e.getMessage()
            );
            throw e;
        }
    }

    private static class Contact {
        private String name;
        private String address;

        public Contact(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }
    }

    public static void main3(String[] args) {
        Map<String, Contact> contacts = new HashMap<>();
        contacts.put("101", new Contact("Пожарная", "ул. Советская, 15"));
        contacts.put("103", new Contact("Скорая помощь", "пр-т Мира, 19"));
        contacts.put("555555", new Contact("Доставка пиццы", "ул. Декабристов, 10"));
        contacts.put("88001000000", new Contact("Горячая линия Почты России", "Красная пл., 5"));

        Scanner scanner = new Scanner(System.in);
        String phone = scanner.next();

        Contact contact = contacts.get(phone);
        if (contact == null) {
            System.out.println("Такой номер телефона отсутствует");
        } else {
            System.out.println(
                    contact.getName() + ": " + contact.getAddress()
            );
        }
    }

    public static void main2(String[] args) {
        PersonalComputer computer = new PersonalComputer();

        PersonalComputer.ComputerItem item = computer.getMotherboard();
//        motherboard = new PersonalComputer.Motherboard(); Если внутренний класс не статичный, то будет ошибка

        System.out.println(item.toString());

        // Map:
        // ключ => значение (термин - определение термина)
        Map<String, Object> map = new HashMap<>();
        map.put("термин", "определение термина");
        map.put("термин2", "другое определение термина");

        System.out.println(map.get("термин"));
        System.out.println(map.get("термин2"));

        PersonalComputer.Motherboard.RAM ram = new PersonalComputer.Motherboard.RAM();

        try {
            dbDemo();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void dbDemo() throws SQLException {
        Connection connection = DriverManager.getConnection(
                "url",
                "username",
                "password"
        );
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM users WHERE id = 25");

        connection.close();
    }
}
