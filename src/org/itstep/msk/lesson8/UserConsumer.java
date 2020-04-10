package org.itstep.msk.lesson8;

import java.util.function.Consumer;

public class UserConsumer implements Consumer<User> {
    @Override
    public void accept(User user) {
        user.setPassword(
                user.getPassword() + "!"
        );
    }
}
