package pl.tima.lesson.comparation;

import pl.tima.facultativ.model.User;
import pl.tima.facultativ.repository.UserRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparableEx {
    public static void main(String[] args) {


        List<User> users = new ArrayList<>();
        users = UserRepository.getUsersFromDataBase();

        Collections.sort(users);

    }

}
