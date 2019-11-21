package JavaSyntax.lvl8.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max5Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {

                if (array[j] > array[i]) {
                    int tmp  = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
