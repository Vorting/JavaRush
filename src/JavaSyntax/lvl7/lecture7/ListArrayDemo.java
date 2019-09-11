package JavaSyntax.lvl7.lecture7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ListArrayDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        for (; i < 5; i++) {
            list.add(i, reader.readLine());

        }

        int min = Integer.MAX_VALUE;

        for (String s : list) {
            if (s.length() < min) {
                min = s.length();
            }
        }

        for (String s2 : list) {
            if (s2.length() == min) {
                System.out.println(s2);
            }
        }

    }
}
