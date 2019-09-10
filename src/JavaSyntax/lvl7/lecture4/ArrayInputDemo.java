package JavaSyntax.lvl7.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayInputDemo {
    public static void main(String[] args) throws IOException {
        int[] array = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum_even = 0, sum_not_even = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0) {
                sum_even += array[i];
            } else {
                sum_not_even += array[i];
            }
        }

        if (sum_even > sum_not_even) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
