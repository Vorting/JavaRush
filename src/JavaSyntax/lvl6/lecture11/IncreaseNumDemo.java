package JavaSyntax.lvl6.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IncreaseNumDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        int i = 0, j;

        for (; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for (i = 1; i < arr.length; i++) {
            for (j = 5 - 1; j >= i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int start = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = start;
                }
            }
        }

        for (i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}

