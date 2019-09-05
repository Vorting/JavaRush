package JavaSyntax.lvl7.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr_strings = new String[10];
        int[] arr_numbers = new int[10];
        int i;

        for (i = 0; i < arr_strings.length; i++) {
            arr_strings[i] = reader.readLine();
            arr_numbers[i] = arr_strings[i].length();
        }

        for (i = 0; i < arr_numbers.length; i++) {
            System.out.println(arr_strings[i].length());
        }

    }
}
