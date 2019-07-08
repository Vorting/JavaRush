package JavaSyntax.lvl4.lecture6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortThreeNumDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        int number1 = Integer.parseInt(n1);

        String n2 = reader.readLine();
        int number2 = Integer.parseInt(n2);

        String n3 = reader.readLine();
        int number3 = Integer.parseInt(n3);

        int[] arr = {number1, number2, number3};
        int tmp, i;
        for (i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 2; j >= i; j--) {
                if (arr[j] < arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
