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
        Map<String, String> map = new HashMap<>();
        createMap(map);
        System.out.println(getCountTheSameFirstName(map, String.valueOf(map)));

    }

    public static Map<String, String> createMap(Map<String, String> map) {

        map.put("Sinclar", "Bob");
        map.put("Tyson", "Mike");
        map.put("Cruise", "Tom");
        map.put("Roth", "Tim");
        map.put("Capaldi", "Lewis");
        map.put("Karol", "Tina");
        map.put("Lucas", "George");
        map.put("Diesel", "Vin");
        map.put("Markx", "Karl");
        map.put("Chan", "Jackie");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String firstName = pair.getValue();
            if (firstName.equals(name)) {
                count++;
            }
        }

        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        return Integer.parseInt(lastName);
    }

}
