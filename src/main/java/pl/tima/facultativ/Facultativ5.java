package pl.tima.facultativ;

import pl.tima.facultativ.model.User;
import pl.tima.facultativ.service.UserService;

import java.util.List;

import static pl.tima.facultativ.repository.UserRepository.getUsersFromDataBase;

public class Facultativ5 {
    public static void main(String[] args) {
        List<User> users = getUsersFromDataBase();
        User withLongestName = UserService.getLongestName(users);
        System.out.println(withLongestName);
        }
    }

