package JavaSyntax.lvl6.lecture11;

import java.util.ArrayList;

public class CatsArrayDemo {
    public static ArrayList<CatsArrayDemo> cats = new ArrayList<>();

    public CatsArrayDemo() {
        cats.add(this);
    }

    public static void printCats() {
        for (int i = 0; i < CatsArrayDemo.cats.size(); i++) {
            System.out.println(CatsArrayDemo.cats.get(i));
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            CatsArrayDemo cat = new CatsArrayDemo();
            cats.add(cat);
        }
        printCats();
    }
}
