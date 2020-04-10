package org.itstep.msk.lesson7;

/**
 * Урок 7. Анонимные классы, аннотации
 */
public class Main {
    @MyAnnotation
    public static void main(String[] args) throws NoSuchMethodException {
        PasswordEncoder encoder = new PasswordEncoder() {
            @Override
            @BadEncoding
            public String encode(String password) {
                return password;
            }
        };
//        encoder = new PlainPasswordEncoder();

        @MyAnnotation String originPassword = "123";

        encodePassword(originPassword, encoder);
    }

    public static void encodePassword(String password, PasswordEncoder encoder) throws NoSuchMethodException {
        if (encoder.getClass().getMethod("encode", String.class).getDeclaredAnnotation(BadEncoding.class) != null) {
            System.out.println("Это плохой метод шифрования!");
        }

        System.out.println(
                encoder.encode(password)
        );
    }
}
