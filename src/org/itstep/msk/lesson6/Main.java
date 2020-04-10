package org.itstep.msk.lesson6;

import java.util.*;

/**
 * Урок 6. Generics (шаблонные типы) + Коллекции JCF (Java Collection Framework)
 */
public class Main {
    public static void main(String[] args) {
//        Window<Weapon> window = new Window<>();

        Wear wear = new Wear();
        Meal meal = new Meal();

        // Корзина с одеждой
        Basket<Wear> wearBasket = new Basket<>(10);
        wearBasket.add(wear);
//        basket.add(meal); Нельзя положить еду в корзину с одеждой

        // Корзина с едой
        Basket<Meal> mealBasket = new Basket<>(15);
        mealBasket.add(meal);
//        mealBasket.add(wear); Нельзя положить одежду в корзину с едой

        // Корзина с чем угодно
        Basket basket = new Basket(20); // Basket<Object>
        basket.add(wear);
        basket.add(meal);

        // В список List один и тот же объект можно положить сколько угодно раз
        ArrayList<Wear> wearList = new ArrayList<>();
        wearList.add(wear);
        wearList.set(0, wear);
        wearList.add(wear);
        wearList.add(wear);
        System.out.println(wearList.size());

        // Во множество Set один и тот же объект можно положить только один раз
        // Set - это множество уникальных объектов
        HashSet<Meal> mealSet = new HashSet<>();
        mealSet.add(meal);
        mealSet.add(meal);
        mealSet.add(meal);
        System.out.println(mealSet.size());

        // Очередь Queue, которая может упорядочивать элементы
        PriorityQueue<Integer> intQueue = new PriorityQueue<>(
                Integer::compareTo
        );
        intQueue.add(10);
        intQueue.add(7);
        intQueue.add(15);

        Iterator<Integer> iterator = intQueue.iterator();
        while (iterator.hasNext()) {
            System.out.print(
                    iterator.next() + ", "
            );
        }

        // (key => value)
        HashMap<String, Basket> map = new HashMap<>();
        map.put("Корзина с одеждой", wearBasket);
        map.put("Корзина с едой", mealBasket);
        map.put("Корзина", basket);
        /*
         Корзина с одеждой -> wearBasket,
         Корзина с едой -> mealBasket,
         Корзина -> basket
         */
        Basket someBasket = map.get("Корзина с едой");

        // window_height = 600
        // window_width = 1000
        // title = Some Project
        // dark_theme = true
        // scale = 10.5
        HashMap<String, Object> options = new HashMap<>();
        options.put("window_height", 600);
        options.put("window_width", 1000);
        options.put("title", "Some Project");
        options.put("dark_theme", true);
        options.put("scale", 10.5);

        Boolean darkTheme = (Boolean) options.get("dark_theme");
    }
}
