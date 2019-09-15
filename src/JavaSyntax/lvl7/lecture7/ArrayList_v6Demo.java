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
        int min_a = 0, max_a = 0, tmp = 0;

        for (int i = 0; i < 10; i++) {
            arrayList.add(i, reader.readLine());
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if () {
            }
        }
    }
}
