package JavaSyntax.lvl4.lecture10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountLineDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int N = Integer.parseInt(reader.readLine());

        while (N != 0) {
            System.out.println(line);
            N--;
        }
    }
}
