package JavaSyntax.lvl5.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            int maximum = 0;
            int minimum = 0;
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(reader.readLine());
                maximum = a;
                if (a > maximum) {
                    maximum = a;
                } else if (a < minimum) {
                    minimum = a;
                    System.out.println(minimum);
                }
            }
            System.out.println("max = " + maximum + ", min = " + minimum);
        } else {
            System.out.println("n меньше 0, выходим...");
        }
    }
}
