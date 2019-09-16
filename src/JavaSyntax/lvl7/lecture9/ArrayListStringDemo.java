package JavaSyntax.lvl7.lecture9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListStringDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> words = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            words.add(reader.readLine());
        }

        words.remove(2);

        for (int j = words.size() - 1; j >= 0; j--) {
            System.out.println(words.get(j));
        }
    }
}
