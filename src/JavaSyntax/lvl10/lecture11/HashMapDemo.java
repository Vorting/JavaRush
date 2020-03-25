package JavaSyntax.lvl10.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> lineMap = new HashMap<>();

        int id = 0;
        String name = "";

        while (true) {
            try {
                id = Integer.parseInt(reader.readLine());
                name = reader.readLine();
                lineMap.put(name, id);
            } catch (NumberFormatException | IOException e) {
                break;
            }
        }

        for (Map.Entry<String, Integer> pair : lineMap.entrySet())
            System.out.println(pair.getValue() + " " + pair.getKey());
    }
}
