package org.itstep.msk.lesson7;

public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(String password) {
        return "!" + password + "!";
    }
}
