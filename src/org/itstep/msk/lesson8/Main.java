package org.itstep.msk.lesson8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Урок 8. Лямбды
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User("admin");
        user1.setPassword("qwerty");
        User user2 = new User("user");
        user2.setPassword("123");
        User user3 = new User("manager");
        user3.setPassword("abc");

        ArrayList<User> users = new ArrayList<>();
        users.add(user3);
        users.add(user2);
        users.add(user1);

        // Вариант 1: Создать класс компаратора UserComparator
        users.sort(new UserComparator());
        // Вариант 2: Воспользоваться анонимным классом
        users.sort(new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getPassword().compareTo(u2.getPassword());
            }
        });
        // Вариант 3: Лямбда-выражение
        users.sort(
                (User u1, User u2) -> {
                    return u1.getPassword().compareTo(u2.getPassword());
                }
        );

        Comparator<User> uc;
        // Полный синтаксис
        uc = (User u1, User u2) -> {
            return u1.getPassword().compareTo(u2.getPassword());
        };
        // Сокращенный синтаксис
        uc = (u1, u2) -> u1.getPassword().compareTo(u2.getPassword());

        users.sort(uc); // uc.compare(user1, user2);

        for (User u : users) {
            System.out.println(
                    u.getUsername() + " : " + u.getPassword()
            );
        }

        System.out.println("==========");

        // Для выполнения неких действий над элементами коллекции, следует использовать метод forEach
        users.forEach(new UserConsumer());
        // Полный синтаксис лямбды
        users.forEach(
                (User user) -> { user.setPassword(user.getPassword() + "!"); }
        );
        // Сокращенный синтаксис лямбды
        users.forEach(
                user -> user.setPassword(user.getPassword() + "!")
        );

        users.forEach(
                u -> System.out.println(u.getUsername() + " : " + u.getPassword())
        );

        System.out.println("==========");

        for (User u : users) {
            u.setPassword(u.getPassword() + "?");
            System.out.println(u.getPassword());
            System.out.println(u.getUsername());
        }
        // Тот же цикл, но в виде лямбды
        users.forEach(
                u -> {
                    u.setPassword(u.getPassword() + "?");
                    System.out.println(u.getPassword());
                    System.out.println(u.getUsername());
                }
        );

        System.out.println("==========");

        users.removeIf(
                // interface Predicate:
                // boolean test(T t);
                (User user) -> {
                    return user.getUsername().equals("admin");
                }
                // Сокращенный вариант:
                // u -> u.getUsername().equals("admin")
        );
        users.forEach(u -> System.out.println(u.getUsername()));
        // Что пришлось бы написать, если бы не было лямбд и метода removeIf
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals("admin")) {
                users.remove(i);
                i--; // Если так не написать, то мы рискуем пропустить мимо админов, идущих подряд друг за другом
            }
        }

        boolean b = Main.myTest(user1); // Вызов статического метода через класс (пишется курсивом)
        users.removeIf(Main::myTest); // Лямбда, позаимствованная у класса Main

        ArrayList<Integer> ints = new ArrayList<>(); // 1 -> "1"
        List<String> strings = ints.stream()
                .map(String::valueOf) // (Integer i) -> { return String.valueOf(i); }
                .peek(System.out::println) // (String s) -> { System.out.println(s); }
                .collect(Collectors.toList());
    }

    public static boolean myTest(User user) {
        return user.getUsername().equals("admin");
    }
}
