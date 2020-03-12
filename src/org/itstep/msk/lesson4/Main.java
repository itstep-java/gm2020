package org.itstep.msk.lesson4;

/**
 * Урок 4. ООП. Абстракция, интерфейсы, полиморфизм
 */
public class Main {
    public static void main(String[] args) {
        // Так создать объект не получится,
        // потому что класс - абстрактный
        //Airplane airplane1 = new Airplane("Boeing");

        Airplane airplane1 = new Boeing();
        airplane1.takeoff(10000);
        ((Boeing) airplane1).allowWiFi();

        Airplane airplane2 = new Airbus();
        airplane2.takeoff(7000);
        //((Boeing) airplane2).allowWiFi(); Это не Боинг!

        /*
        Полиморфизм - если я умею работать с базовым типом,
        то я легко смогу работать с любым типом, который является
        наследником базового, при этом даже не буду знать о том,
        что это какой-то наследник
         */
        getAirplainBrand(airplane1);
        getAirplainBrand(airplane2);

        airplane1 = airplane2;

        Basket basket = new Basket();
        basket.addProduct(airplane1);
        basket.addProduct(airplane2);
        basket.printAll();
    }

    // Я могу вывести на экран бренд любого самолета
    // Это и есть полиморфизм
    public static void getAirplainBrand(Airplane airplane) {
        System.out.println(
                airplane.getBrand()
        );
    }
}
