package JavaSyntax.lvl7.lecture7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList_v5Demo {
    public static void main(String[] args) throws IOException {

        ArrayList<String> arrayList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            arrayList.add(i, reader.readLine());
        }

        int max = Integer.MIN_VALUE;

        for (String s : arrayList) {
            if (s.length() > max) {
                max = s.length();
            }
        }

        for (String s2 : arrayList) {
            if (s2.length() == max) {
                System.out.println(s2);
            }
        }
    }
}
