package pl.tima.streams;

import pl.tima.facultativ.model.Gender;
import pl.tima.facultativ.model.User;
import pl.tima.facultativ.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args) {
        List<User> allUsers = UserRepository.getUsersFromDataBase();
        List<User> editedUsers =
                allUsers.stream().map(user -> {
                            user.setName(user.getName().toLowerCase());
                            return user;
                        }).peek(System.out::println)        // выводит на экран и не закрывает stream
                        .filter((sex -> sex.getGender() == Gender.FEMALE && sex.getAge() > 25))
                        .collect(Collectors.toList());
    }
}
