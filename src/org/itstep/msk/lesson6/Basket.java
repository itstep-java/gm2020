package org.itstep.msk.lesson6;

public class Basket<T> {
    /**
     * Массив товаров
     */
    private T[] items;

    /**
     * Текущее количество товаров в корзине
     */
    private int count = 0;

    /**
     * Конструктор корзины
     * @param limit Максимальное количество товаров в корзине
     */
    @SuppressWarnings("unchecked")
    public Basket(int limit) {
        items = (T[]) new Object[limit];
    }

    /**
     * Добавить товар в корзину
     * Если в корзине не осталось места, то товар не добавится
     * @param item Товар
     */
    public void add(T item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        }
    }

    public T getLast() {
        return items[count - 1];
    }
}
