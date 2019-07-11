package JavaSyntax.lvl4.lecture6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NamesDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name_one = reader.readLine();
        String name_two = reader.readLine();

        if (name_one.equals(name_two)) {
            System.out.println("Имена идентичны");
        }
        if (!name_one.equals(name_two) && name_one.length() == name_two.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
