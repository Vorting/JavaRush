package JavaSyntax.lvl3.lecture7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReaderDemo3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
