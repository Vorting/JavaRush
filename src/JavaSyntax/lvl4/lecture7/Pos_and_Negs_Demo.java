package JavaSyntax.lvl4.lecture7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pos_and_Negs_Demo {
    public static void main(String[] args) throws IOException {
        int neg = 0;
        int pos = 0;
        int lenght = 3;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < lenght; i++) {
            int n = Integer.parseInt(reader.readLine());
            if (n > 0) {
                pos++;
            }
            if (n < 0) {
                neg++;
            }
        }

        System.out.println("количество положительных чисел: " + pos + "\n" + "количество отрицательных чисел: " + neg);
    }
}
