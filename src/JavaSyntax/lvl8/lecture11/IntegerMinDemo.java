package JavaSyntax.lvl8.lecture11;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerMinDemo {
    public static void main(String[] args) throws IOException {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));

    }

    public static int getMinimum(List<Integer> array) {

        return Collections.min(array);
    }


    private static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int size = Integer.parseInt(reader.readLine());
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }
}
