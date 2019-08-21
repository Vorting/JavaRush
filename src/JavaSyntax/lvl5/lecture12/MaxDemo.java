package JavaSyntax.lvl5.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = 0;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(reader.readLine());
                if (i == 0) {
                    maximum = a;
                } else if (a > maximum) {
                    maximum = a;
                }
            }
        }
        System.out.println(maximum);
    }
}
