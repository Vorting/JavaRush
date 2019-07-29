package JavaSyntax.lvl5.lecture5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageNumbersDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double num, result;
        double sum = 0;
        int count = 0;
        for (int i = 0; ; i++) {
            num = Integer.parseInt(reader.readLine());
            count++;
            if (num == -1) {
                count--;
                break;
            }
            sum += num;
        }
        result = sum / count;
        System.out.println(result);
    }
}
