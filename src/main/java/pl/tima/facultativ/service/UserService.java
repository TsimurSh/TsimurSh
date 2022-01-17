package pl.tima.facultativ.service;

import pl.tima.facultativ.model.User;

import java.util.List;

public class UserService {
    public static User getLongestName(List<User> users) {
        User tempUser = null;
        for (User user : users){
          if (user.getName().length() > tempUser.getLastName().length()){
             tempUser = user;
          }
        }
          return tempUser;
    }
}
