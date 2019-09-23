package JavaSyntax.lvl7.lecture9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListDoubleDemo {

    public static void main(String[] args) throws IOException {
        ArrayList<String> some_arr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            some_arr.add(reader.readLine());
        }
        ArrayList<String> result = doubleValues(some_arr);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.get(i));
            i++;
        }
        return list;
    }
}
