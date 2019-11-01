package JavaSyntax.lvl8.lecture8;
/*
Перепись населенияcapaldi
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

    }

    public static Map<String, String> createMap() {

        Map<String, String> map = new HashMap<>();

        map.put("Sinclar", "Mike");
        map.put("Tyson", "Mike");
        map.put("Cruise", "Tom");
        map.put("Roth", "Mike");
        map.put("Capaldi", "Lewis");
        map.put("Karol", "Tina");
        map.put("Lucas", "Karl");
        map.put("Diesel", "Mike");
        map.put("Markx", "Karl");
        map.put("Chan", "Jackie");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
        }
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {

        int count = 0;
        for (String line : map.values()) {
            if (line.equals(name)) {
                count += 1;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count2 = 0;
        for (String line : map.keySet()) {
            if (line.equals(lastName)) {
                count2 += 1;
            }
        }
        return count2;
    }
}
