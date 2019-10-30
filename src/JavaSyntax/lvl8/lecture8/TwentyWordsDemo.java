package JavaSyntax.lvl8.lecture8;

import java.util.HashSet;
import java.util.Set;

public class TwentyWordsDemo {
    public static void main(String[] args) {

    }


    public static Set<String> createSet() {
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            stringSet.add("Лак" + i);
        }
        return stringSet;
    }
}
