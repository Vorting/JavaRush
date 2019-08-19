package JavaSyntax.lvl5.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);
        System.out.println("Minimum = " + minimum);
    }

    private static int min(int a, int b, int c, int d, int e) {
        return (a <= b) ? ((c <= d) ? c : ((e <= a) ? e : a)) : ((a < c) ? a : (b < c) ? b : c);
    }
}
