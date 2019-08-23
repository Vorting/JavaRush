package JavaSyntax.lvl6.lecture5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Even_not_Even_Demo {
    private static int even;
    private static int odd;
    private static int result;

    public static void main(String[] args) throws IOException {

        Even_not_Even_Demo even_odd = new Even_not_Even_Demo();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        result = even_odd.even_count(Integer.parseInt(reader.readLine()));
        System.out.println("Even: " + even_odd.even_count(result));
        System.out.println("Odd: " + even_odd.odd_count(result));

    }

    public int even_count(int num) {
        int tmp = 0;
        for (; num != 0; num /= 10) {
            tmp = num % 10;
            if (tmp % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    public int odd_count(int num) {
        this.even_count(num);
        int tmp = 0;
        for (; num != 0; num /= 10) {
            tmp = num % 10;
            if (num % 2 == 1) {
                odd++;
            }
        }
        return odd;
    }
}
