package JavaSyntax.lvl8.lecture3;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("Sim", 5);
        hashMap.put("Tom", 5.5);
        hashMap.put("Arbus", false);
        hashMap.put("Baby", null);
        hashMap.put("Cat", "Cat");
        hashMap.put("Eat", new Long(56));
        hashMap.put("Food", new Character('3'));
        hashMap.put("Gevey", '6');
        hashMap.put("Hugs", 111111111111L);
        hashMap.put("Comp", (double) 123);

        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
