package JavaSyntax.lvl7.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListEndDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        String stop = "end";

        do {
            arrayList.add(reader.readLine());
        } while (!arrayList.contains(stop));
        if (arrayList.contains(stop)) {
            arrayList.remove(stop);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i);
        }
    }
}
