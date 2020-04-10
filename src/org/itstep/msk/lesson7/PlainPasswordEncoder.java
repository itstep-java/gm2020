package org.itstep.msk.lesson7;

/**
 * Этот класс опасен! Его нужно удалить
 */
public class PlainPasswordEncoder implements PasswordEncoder {
    @Override
    @BadEncoding
    public String encode(String password) {
        return password;
    }
}
