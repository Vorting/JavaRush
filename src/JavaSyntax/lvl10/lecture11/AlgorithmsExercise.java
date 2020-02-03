package JavaSyntax.lvl10.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AlgorithmsExercise {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[12];
        for (int i = 0; i < 12; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        int half_size = array.length / 2;

        while (half_size > 0) {
            for (int i = 0; i < (array.length - half_size); i++) {
                int j = i;
                while ((j >= 0) && (array[j] > array[j + half_size])) {
                    int tmp = array[j];
                    array[j] = array[j + half_size];
                    array[j + half_size] = tmp;
                    j--;
                }
            }
//            System.out.println("half_size = " + half_size);
            half_size /= 2;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
