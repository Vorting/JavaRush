package JavaSyntax.lvl8.lecture6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class NumericOrderDemo {
    private static int max = 0;

    public static void main(String[] args) throws IOException {
        List<Integer> numOrder = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            numOrder.add(Integer.valueOf(reader.readLine()));
        }

        System.out.println(fillList(numOrder) + " колличество повторяющихся цифр " + max);
    }


    public static List<Integer> fillList(List<Integer> list) {


        ListIterator listIterator = list.listIterator();
        List<Object> list2 = new ArrayList<>();

        Object current = listIterator.next();
        Object previous = listIterator.previous();
        int count = max;
        int min = 0;

        while (listIterator.hasNext()) {
            listIterator.hasNext();
            if (current != previous) {
                current = listIterator.next();
                count++;
            } else {
                previous = current.getClass();
                min++;
            }
        }

        return list;
    }
}
