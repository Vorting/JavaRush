package JavaSyntax.lvl7.lecture7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");

        System.out.println(arrayList.size());
        for (String x : arrayList) {
            System.out.println(x);
        }

    }
}
