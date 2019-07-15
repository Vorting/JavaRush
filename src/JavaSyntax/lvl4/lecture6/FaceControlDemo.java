package JavaSyntax.lvl4.lecture6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FaceControlDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        String age = reader.readLine();

        int a = Integer.parseInt(age);

        if (a >20) {
            System.out.println("И 18-ти достаточно");
        } else if (a <= 20) {
            System.out.print("");
        }
    }
}
