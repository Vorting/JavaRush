package JavaSyntax.lvl4.lecture6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeastOfTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number1 = reader.readLine();

        int num1 = Integer.parseInt(number1);

        String number2 = reader.readLine();

        int num2 = Integer.parseInt(number2);

        if (num1 < num2) {
            System.out.println(num1);
        } else if (num2 < num1) {
            System.out.println(num2);
        } else if (num1 == num2) {
            System.out.println(num1);
        }
    }
}
