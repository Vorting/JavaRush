package JavaSyntax.lvl8.lecture6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class NumericOrderDemo {
    private static int max = 0;
    private static int min = 0;

    public static void main(String[] args) throws IOException {
        List<Integer> numOrder = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            numOrder.add(Integer.valueOf(reader.readLine()));
        }

        System.out.println(fillList(numOrder));
    }


    public static List<Integer> fillList(List<Integer> list) {

        ListIterator listIterator = list.listIterator(1);
        List<Integer> list2 = new ArrayList<>();

        int nextIdx = listIterator.nextIndex();
        int prevIdx = listIterator.previousIndex();
        int countMax = max;
        int countMin = min;

        while (listIterator.hasNext()) {
            listIterator.hasNext();
            if (prevIdx == nextIdx) {
                nextIdx = (int) listIterator.next();
                countMin--;
            } else if (prevIdx != nextIdx) {
                nextIdx = (int) listIterator.next();
                prevIdx=nextIdx;
                countMax++;
                list2.add(countMax);
            }
        }

        return Collections.singletonList(list2.size());
    }
}
