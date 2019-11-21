package JavaSyntax.lvl8.lecture11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCats {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> catIterator = cats.iterator();
        if (catIterator.hasNext()) {
            cats.remove(catIterator.next());
        }
        printCats(cats);

    }

    public static Set<Cat> createCats() {
        Set<Cat> catSet = new HashSet<Cat>();

        for (int i = 0; i < 3; i++) {
            catSet.add(new Cat());
        }
        return catSet;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        public Cat() {
        }
    }
}
