package JavaSyntax.lvl5.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PiggyBankConsoleDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(reader.readLine());
        int sum = 0;
        boolean flag = false;

        do {
            String stop = reader.readLine();
            if (stop.equals(' ')) {
                break;
            }
            for (int i = nums; i != 0; i /= 10) {
                int tmp = Integer.parseInt(reader.readLine());
                sum += tmp;
                flag = true;
            }
            System.out.println(sum);
        } while (!flag);
    }
}
