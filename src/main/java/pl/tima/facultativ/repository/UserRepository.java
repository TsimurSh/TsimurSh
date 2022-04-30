package pl.tima.facultativ.repository;

import pl.tima.facultativ.model.Gender;
import pl.tima.facultativ.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository  {
    public static List<User> getUsersFromDataBase() {
        User user1 = new User(1, "Vlad", "Bumaga", 32, Gender.MALE);
        User user2 = new User(3, "Olga", "Buaga", 30, Gender.FEMALE);
        User user3 = new User(4, "Lada", "Buli", 23, Gender.FEMALE);
        User user4 = new User(7, "Alla", "Buli", 17, Gender.FEMALE);
        User user5 = new User(5, "Alla", "Buli", 33, Gender.FEMALE);
        User user6 = new User(6, "Allo", "Buli", 18, Gender.MALE);
        User user7 = new User(8, "Gagarin", "Bali", 90, Gender.MALE);

        List <User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        return users;
    }
}
