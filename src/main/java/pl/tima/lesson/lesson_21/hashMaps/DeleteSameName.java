package pl.tima.lesson.lesson_21.hashMaps;

import pl.tima.facultativ.model.Gender;
import pl.tima.homework.homework22.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeleteSameName {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Смирнов", "Сильвестр");
        map.put("Иванов", "Дмитрий");
        map.put("Кузнецов", "Арнольд");
        map.put("Соколов", "Роман");
        map.put("Попов", "Максим");
        map.put("Лебедев", "Ярослав");
        map.put("Новиков", "Арнольд");
        map.put("Козлов", "Михаил");
        map.put("Морозов", "Илья");
        map.put("Петров", "Арнольд");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (String tempName : copy.values()) {
            int counter = 0;
            for (String name : map.values()){
                if (tempName.equals(name)){
                    counter++;
                }
            }
            if (counter > 1)
                removeItemFromMapByValue(map, tempName);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) { // for each to iterate HashMap
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> surName = createMap();
        removeTheFirstNameDuplicates(surName);
        System.out.println(surName);

//        Example of putting to map enum list as keys and arraylist elements as values
        List <Student> studentList = new ArrayList<>();
        Map<Gender, Student> statisticRepTest = new HashMap<>();
        List<Gender> plans = List.of(Gender.values());
        statisticRepTest
                .putAll(IntStream.range(0, plans.size())
                        .boxed()
                        .collect(Collectors.toMap(plans::get, studentList::get,
                                (e1, e2) -> e1, HashMap::new)));

    }
}

