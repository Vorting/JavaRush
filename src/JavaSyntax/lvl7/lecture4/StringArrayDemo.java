package JavaSyntax.lvl7.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringArrayDemo {
    public static void main(String[] args) throws IOException {
        String[] array = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        for (; i < array.length; i++) {
            if (i < 8) {
                array[i] = String.valueOf(Integer.parseInt(reader.readLine()));
                continue;
            }
        }

        for (i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
