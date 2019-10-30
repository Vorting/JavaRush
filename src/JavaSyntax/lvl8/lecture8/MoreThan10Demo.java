package JavaSyntax.lvl8.lecture8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MoreThan10Demo {
    public static void main(String[] args) {

    }

    public static Set<Integer> createSet() {
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            hashSet.add(i);
        }
        return hashSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){

            if (iterator.next()>10) iterator.remove();
        }

        return set;
    }
}
