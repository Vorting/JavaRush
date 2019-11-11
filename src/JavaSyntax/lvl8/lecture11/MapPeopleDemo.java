package JavaSyntax.lvl8.lecture11;

import java.util.HashMap;
import java.util.Map;

public class MapPeopleDemo {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    private static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Nicholson", "Jack");
        }

        return map;
    }


    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());

        }
    }
}
