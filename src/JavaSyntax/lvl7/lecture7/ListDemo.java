package JavaSyntax.lvl7.lecture7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) throws IOException {
        List<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            arrayList.add(i, "Test");
        }

        for (int j = 0; j < arrayList.size(); j++) {
            arrayList.add(0, reader.readLine());
        }

        for (String s : arrayList) {
            System.out.println(s);
        }

    }
}
