package JavaSyntax.lvl7.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysDemo {
    private static int size = 3;

    public static void main(String[] args) throws IOException {
        String[] arr_strings = new String[size];
        int[] arr_numbers = new int[size];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        for (; i < arr_strings.length; i++) {
            arr_strings[i] = String.valueOf(reader.readLine());
        }

        for (; i < arr_strings.length; i++) {
            arr_numbers[i] = arr_strings[i].indexOf(i);
        }
        System.out.println(" length" + arr_numbers);

    }
}
