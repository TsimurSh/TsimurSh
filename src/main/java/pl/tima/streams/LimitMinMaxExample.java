package pl.tima.streams;

import pl.tima.facultativ.model.User;
import pl.tima.facultativ.repository.UserRepository;

import java.util.List;

public class LimitMinMaxExample {
    public static void main(String[] args) {

        List<User> allUsers = UserRepository.getUsersFromDataBase();
        System.out.println(allUsers.stream().max((user1, user2) -> user1.getId().compareTo(user2.getId())).get()
                + " found \uD83E\uDD4F");
        System.out.println(allUsers.stream().min((user1, user2) -> user1.getId().compareTo(user2.getId())).get()
                + " found 🛷");
        allUsers.stream().filter(user1 -> user1.getAge()>20).limit(3).forEach(System.out::println);
















    }
}
