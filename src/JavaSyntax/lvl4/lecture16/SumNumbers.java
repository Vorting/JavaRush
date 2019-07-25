package JavaSyntax.lvl4.lecture16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        int tmp = 0;
        for (int i = 0; ; i++) {
            number = Integer.parseInt(reader.readLine());
            tmp += number;
            if (number == -1) {
                break;
            }
        }
        System.out.println(tmp);
    }
}
