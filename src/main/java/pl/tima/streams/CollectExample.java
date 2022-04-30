package pl.tima.streams;

import pl.tima.facultativ.model.Gender;
import pl.tima.facultativ.model.User;
import pl.tima.facultativ.repository.UserRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {

    public static void main(String[] args) {
        List<User> allUsers = UserRepository.getUsersFromDataBase();
//groupBy
        Map<Gender, List<User>> usersGroup =
        allUsers.stream()
                .filter(user -> user.getAge() > 18)
                .collect(Collectors.groupingBy(ele -> ele.getGender()));

        for (Map.Entry<Gender, List<User>> entry : usersGroup.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
//partitioningBy
        Map<Boolean, List<User>> usersPartition =
                allUsers.stream()
                        .collect(Collectors.partitioningBy(ele -> ele.getGender()==Gender.MALE));

        for (Map.Entry<Boolean, List<User>> entry : usersPartition.entrySet()){
            System.out.println("__________________________________" +
                    entry.getKey() + " " + entry.getValue());
        }
    }

}
