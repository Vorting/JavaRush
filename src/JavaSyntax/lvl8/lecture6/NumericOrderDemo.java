package JavaSyntax.lvl8.lecture6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumericOrderDemo {
    private static int countOrder = 0;

    public static void main(String[] args) throws IOException {
        List<Integer> numOrder = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            numOrder.add(i, Integer.valueOf(reader.readLine()));
        }

        System.out.println(fillList(numOrder) + " колличество повторяющихся цифр "
                + countOrder);

    }

    public static List<Integer> fillList(List<Integer> list) {

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.hasNext());
        }

        return list;
    }
}
