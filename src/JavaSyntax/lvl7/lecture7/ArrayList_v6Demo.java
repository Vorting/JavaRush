package JavaSyntax.lvl7.lecture7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayList_v6Demo {
    public static void main(String[] args) throws IOException {

        List<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            arrayList.add(i, reader.readLine());
        }

        int min_a = arrayList.get(0).length();
        int max_a = min_a;

        for (String s : arrayList) {
            if (s.length() > max_a) {
                max_a = s.length();
            }
            if (s.length() < min_a) {
                min_a = s.length();
            }
        }

        for (String s2 : arrayList) {
            if (s2.length() == max_a || s2.length() == min_a) {
                System.out.println(s2);
                break;
            }
        }
    }
}
