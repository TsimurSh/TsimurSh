package pl.tima.lesson.lesson_21.hashMaps;

import java.util.HashMap;
import java.util.Map;

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
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> surName = createMap();
        removeTheFirstNameDuplicates(surName);
        System.out.println(surName);

    }
}

