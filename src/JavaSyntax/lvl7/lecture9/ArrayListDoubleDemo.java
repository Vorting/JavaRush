package JavaSyntax.lvl7.lecture9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListDoubleDemo {
    private static BufferedReader reader;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> some_arr = new ArrayList<>(3);
        ArrayList<String> result = doubleValues(some_arr);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result);
        }
    }


    public static ArrayList<String> doubleValues(ArrayList<String> list) throws IOException {

        for (int i = 0; i < list.size(); i++) {
            list.add(i, reader.readLine());
        }

        return list;
    }

}
