package JavaSyntax.lvl10.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int id = Integer.parseInt(reader.readLine());
        String name = reader.readLine();
        Map map = new HashMap();

        if (name.isEmpty()) {
            break;
        }


        map.put(id, name);


        System.out.println("Id= " + id + " Name=" + name);


    }
}
