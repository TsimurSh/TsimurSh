package pl.tima.streams;

import pl.tima.facultativ.model.Gender;
import pl.tima.facultativ.model.User;
import pl.tima.facultativ.repository.UserRepository;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodChaining {
    public static void main(String[] args) {
        int[] arrayOfInts = {23, 35, 87, 54, 2, 11, 0, 98, 45, 73, 77, 65};
        int intersrg = Arrays.stream(arrayOfInts).filter(element -> element % 2 == 1)
                .map(element ->
                {
                    if (element % 3 == 0) {
                        element = element / 3;
                    }
                    return element;
                })
                .reduce((x, y) -> x + y).getAsInt();
        System.out.println(intersrg);

        List<User> allUsers = UserRepository.getUsersFromDataBase();
//        List <User> editedUsers =
        allUsers.stream().map(user -> {
                    user.setName(user.getName().toLowerCase());
                    return user;
                })
                .filter((sex -> sex.getGender() == Gender.FEMALE && sex.getAge() > 25))
                .forEach(System.out::println);
    }
}
