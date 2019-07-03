package JavaSyntax.lvl4.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Positive_Negative {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        String num = reader.readLine();
        int result = Integer.parseInt(num);
        operation(result);

    }

    public static int operation(int num_in) {

        if (num_in > 0) {
            num_in *= 2;
            System.out.println(num_in);
        } else if (num_in < 0) {
            System.out.println(++num_in);
        } else if (num_in == 0) {
            num_in = 0;
            System.out.println(num_in);
        }
        return num_in;
    }
}
