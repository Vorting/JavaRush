package JavaSyntax.lvl8.lecture8;

import java.util.*;

public class Map3Demo {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();

        map.put("Sinclar", "Mike");
        map.put("Tyson", "Mike");
        map.put("Cruise", "Tom");
        map.put("Sinclar", "Mike");
        map.put("Capaldi", "Lewis");
        map.put("Karol", "Tina");
        map.put("Lucas", "Karl");
        map.put("Diesel", "Mike");
        map.put("Karol", "Karl");
        map.put("Chan", "Jackie");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        List valueList = new ArrayList(map.values());

        for(int i = 0; i < valueList.size() -1 ; i++) {
            for(int j = i+1; j < valueList.size(); j++) {
                if (valueList.get(i).equals(valueList.get(j))) {
                    removeItemFromMapByValue(map, (String) valueList.get(i));
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<>();
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        removeTheFirstNameDuplicates(createMap());
    }
}
