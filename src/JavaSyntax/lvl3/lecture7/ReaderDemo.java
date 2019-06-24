package JavaSyntax.lvl3.lecture7;

import java.io.*;

public class ReaderDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        String name = reader.readLine();

        System.out.println(name + " захватит мир через " + num + " лет. Му-ха-ха!");
    }
}
