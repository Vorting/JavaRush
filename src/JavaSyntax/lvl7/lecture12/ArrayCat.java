package JavaSyntax.lvl7.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayCat {
    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int weight = 0;
        int tailLength = 0;
        while (true) {
            String name = reader.readLine();
//            String name = scanner.nextLine();
            if (name == null || name.isEmpty()) {
                break;
            }
            age = Integer.parseInt(reader.readLine());
            weight = Integer.parseInt(reader.readLine());
            tailLength = Integer.parseInt(reader.readLine());
//            age = scanner.nextInt();
//            weight = scanner.nextInt();
//            tailLength = scanner.nextInt();


            Cat cat = new Cat(name, age, weight, tailLength);
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
        private int age;
        private int weight;
        private int tailLength;
        private String name;

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
