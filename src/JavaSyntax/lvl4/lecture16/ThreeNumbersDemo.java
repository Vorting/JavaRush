package JavaSyntax.lvl4.lecture16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeNumbersDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int mid = (a > b) ? ((c < b) ? b : ((c < a) ? c : a)) : ((a > c) ? a : (b > c) ? c : b);
        System.out.println(mid);
    }
}
