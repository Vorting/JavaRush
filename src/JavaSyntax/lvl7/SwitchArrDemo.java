package JavaSyntax.lvl7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchArrDemo {
    public static void main(String[] args) throws IOException {

        int[] arr = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        for (; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for (i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
