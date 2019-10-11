package JavaSyntax.lvl7.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayCat {
    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = reader.readLine();
            int age = 0;
            int weight = 0;
            int tail = 0;

            age = Integer.parseInt(reader.readLine());
            weight = Integer.parseInt(reader.readLine());
            tail = Integer.parseInt(reader.readLine());

            if (name == null || name.isEmpty()) {
                break;
            }

            Cat cat = new Cat(name, age, weight, tail);
            CATS.add(cat);
        }

        printList();
    }

    private static void printList() {
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat {
        private static int age;
        private static int weight;
        private static String name;
        private static int tailLength;

        public Cat(String name, int age, int weight, int tail) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tail;
        }

        @Override
        public String toString() {
            return "Cat`s name: " + name + ", age: " +
                    age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}
