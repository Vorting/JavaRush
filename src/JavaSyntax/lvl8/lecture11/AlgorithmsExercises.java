package JavaSyntax.lvl8.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AlgorithmsExercises {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    private static void sort(String[] array) {
        Arrays.sort(array);
        isGreaterThan("A", "B");
    }


    private static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

}
