package org.itstep.msk.lesson8;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        // -1 - user1 < user2
        // 0 - user1 == user2
        // 1 - user1 > user2
        // Сравниваем пароль первого пользователя с паролем второго
        return user1.getPassword().compareTo(user2.getPassword());
    }
}
