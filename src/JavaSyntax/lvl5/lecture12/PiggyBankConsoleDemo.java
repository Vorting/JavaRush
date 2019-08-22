package JavaSyntax.lvl5.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PiggyBankConsoleDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(reader.readLine());
        int sum = 0, answer = 0;

            while (true) {
                String s = reader.readLine();
                for (; nums != 0; nums /= 10) {
                    sum += nums % 10;
                    answer = sum;
                }
                if (s.equals("сумма")) {
                    break;
                }
            }
        System.out.println(answer);
    }
}
