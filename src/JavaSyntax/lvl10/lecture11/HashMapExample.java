package JavaSyntax.lvl10.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    Map<Integer, String> map;
    static Integer index;
    static String name;

    public HashMapExample() {
        this.map = new HashMap<Integer, String>();
//        map.put(index, name);
    }

    public static void main(String[] args) throws IOException {
        HashMapExample mapExample = new HashMapExample();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            mapExample.map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : mapExample.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
