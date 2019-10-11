package JavaSyntax.lvl7.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListSwitchDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            arrayList.add(String.valueOf(N));
        }

        for (int i = 0; i < M; i++) {
            arrayList.add(arrayList.size() - 1, arrayList.remove(0));
        }

        for (String s : arrayList) {
            System.out.println(arrayList);
        }
    }
}
