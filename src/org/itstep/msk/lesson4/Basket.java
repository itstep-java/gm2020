package org.itstep.msk.lesson4;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Airplane> products = new ArrayList<>();

    public void addProduct(Airplane product) {
        products.add(product);
    }

    public void printAll() {
        for (Airplane airplane : products) {
            System.out.println(
                    airplane.getBrand()
            );
        }
    }
}
