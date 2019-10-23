package JavaSyntax.lvl8.lecture3;

import java.util.HashMap;
import java.util.Map;

public class Map2Demo {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("арбуз", "ягода");
        hashMap.put("банан", "трава");
        hashMap.put("вишня", "ягода");
        hashMap.put("груша", "фрукт");
        hashMap.put("дыня", "овощ");
        hashMap.put("ежевика", "куст");
        hashMap.put("жень-шень", "корень");
        hashMap.put("земляника", "ягода");
        hashMap.put("ирис", "цветок");
        hashMap.put("картофель", "клубень");

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
