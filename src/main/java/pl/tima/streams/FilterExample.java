package pl.tima.streams;

import pl.tima.facultativ.model.Gender;
import pl.tima.facultativ.model.User;
import pl.tima.facultativ.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {

        List <User> allUsers = UserRepository.getUsersFromDataBase();
        List <User> allUpdUsers = allUsers.stream().filter(element -> element
                .getAge() > 20 || element.getGender() == Gender.FEMALE).toList();
        allUpdUsers.forEach(System.out::println); // djn
    }
}
