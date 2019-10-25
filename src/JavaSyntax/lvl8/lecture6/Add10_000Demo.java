package JavaSyntax.lvl8.lecture6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Add10_000Demo {
    public static void main(String[] args) {

        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {

        long start = System.currentTimeMillis();

        insert10000(list);

        long end = System.currentTimeMillis();

        long result = end - start;

        return result;

    }

    public static void insert10000(List list) {

        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
