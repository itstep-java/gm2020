package org.itstep.msk.lesson4;

/*
Наследование - возможность наследовать, расширять другие классы
 */
public class Boeing extends Airplane {
    public Boeing() {
        super("Boeing");
    }

    @Override
    public void takeoff(int height) {
        System.out.println(
                getBrand() + " взлетел на высоту " + height + " метров"
        );
    }

    public void allowWiFi() {
        System.out.println("В " + getBrand() + " включили Wi-Fi");
    }
}
