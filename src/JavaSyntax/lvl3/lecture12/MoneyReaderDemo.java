package JavaSyntax.lvl3.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyReaderDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        System.out.println("Я буду зарабатывать " + "$" + input + " в час");
    }
}
