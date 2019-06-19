package JavaSyntax.lvl3.lecture7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReaderDemo4 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        System.out.println(name + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}
