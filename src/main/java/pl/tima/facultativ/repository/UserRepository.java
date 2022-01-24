package pl.tima.facultativ.repository;

import pl.tima.facultativ.model.Gender;
import pl.tima.facultativ.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository  {
    public static List<User> getUsersFromDataBase() {
        User user1 = new User(1, "Wlad", "Bumaga", 32, Gender.MALE);
        User user2 = new User(3, "Olga", "Buaga", 30, Gender.FEMALE);
        User user3 = new User(7, "Lada", "Buli", 23, Gender.MALE);

        List <User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }
}
