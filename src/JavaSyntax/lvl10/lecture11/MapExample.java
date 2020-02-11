package JavaSyntax.lvl10.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        Map<String, Integer> result = new HashMap<>();
        for (String search_word : list) {
            if (result.containsKey(search_word)) {
                result.put(search_word, result.get(search_word) + 1);
            } else {
                result.put(search_word, 1);
            }
        }
        return result;
    }
}


