package pl.tima.streams;

import pl.tima.facultativ.model.User;
import pl.tima.facultativ.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
    public static void main(String[] args) {
        List<User> allUsers = UserRepository.getUsersFromDataBase();
        List <User> sortedUsers =
        allUsers.stream().sorted((a,b)-> a.getName().compareToIgnoreCase(b.getName()))
                .collect(Collectors.toList());
        System.out.println(allUsers);
        System.out.println(sortedUsers);
    }
}
