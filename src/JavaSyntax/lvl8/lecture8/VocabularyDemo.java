package JavaSyntax.lvl8.lecture8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class VocabularyDemo {
    public static void main(String[] args) {

    }

    public static Map<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        {
            map.put("Горбачев", 599);
            map.put("Чапаев", 1599);
            map.put("Сталин", 434);
            map.put("Депп", 132);
            map.put("Хрущев", 9487);
            map.put("Иванов", 732);
            map.put("Власов", 354);
            map.put("Нечитайло", 400);
            map.put("Бабич", 1932);
            map.put("Вашингтон", 243);
        }
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>();

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500) {
                String key = pair.getKey();
                Integer value = pair.getValue();
                map.remove(pair.getKey());
            }
        }
    }
}
