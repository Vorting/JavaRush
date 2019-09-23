package JavaSyntax.lvl7.lecture9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListSortDemo {
    public static void main(String[] args) throws IOException {
        List<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            if (arrayList.get(i).length() <= arrayList.get(i - 1).length()) {
                System.out.println(i);
                break;
            }
        }
    }
}
