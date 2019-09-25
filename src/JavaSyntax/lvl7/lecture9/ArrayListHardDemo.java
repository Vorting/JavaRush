package JavaSyntax.lvl7.lecture9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListHardDemo {
    public static void main(String[] args) throws IOException {
        List<Integer> mainArray = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            mainArray.add(Integer.valueOf(reader.readLine()));
        }

        List<Integer> divByThree = new ArrayList<>();
        for (int i = 0; i < mainArray.size(); i++) {
            divByThree.add(i, mainArray.get(i));
        }
        System.out.println("divByThree array: ");
        printList((ArrayList<Integer>) divByThree);

        List<Integer> divByTwo = new ArrayList<>();
        for (int i = 0; i < mainArray.size(); i++) {
            divByTwo.add(i, mainArray.get(i));
        }
        System.out.println("divByTwo array: ");
        printList((ArrayList<Integer>) divByTwo);

        List<Integer> divByOthers = new ArrayList<>();
        for (int i = 0; i < mainArray.size(); i++) {
            divByOthers.add(i, mainArray.get(i));
        }
        System.out.println("divByOthers array: ");
        printList((ArrayList<Integer>) divByOthers);
    }

    public static void printList(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                System.out.println(list.get(i));
            }
            if (list.get(i) % 2 == 0) {
                System.out.println(list.get(i));

            } else if ((list.get(i) % 3 != 0) && (list.get(i) % 2 != 0)) {
                System.out.println(list.get(i));
            }
        }
    }
}
