package JavaSyntax.lvl8.lecture3;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("один", "Боб");
        hashMap.put("два", "Майк");
        hashMap.put("три", "Том");
        hashMap.put("четыре", "Тим");
        hashMap.put("пять", "Льюис");
        hashMap.put("шесть", "Барт");
        hashMap.put("семь", "Джек");
        hashMap.put("восемь", "Лойд");
        hashMap.put("девять", "Гарри");
        hashMap.put("десять", "Питер");

        printKeys(hashMap);
    }

    public static void printKeys(Map<String, String> map) {

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
