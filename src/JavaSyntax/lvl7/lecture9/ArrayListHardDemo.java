package JavaSyntax.lvl7.lecture9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListHardDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> mainArray = new ArrayList<>();
        ArrayList<Integer> divByThree = new ArrayList<>();
        ArrayList<Integer> divByTwo = new ArrayList<>();
        ArrayList<Integer> divByOthers = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            mainArray.add(Integer.valueOf(reader.readLine()));
        }

        for (Integer nums : mainArray) {
            if ((nums % 3 == 0) && (nums % 2 == 0)) {
                divByThree.add(nums);
                divByTwo.add(nums);
            } else if (nums % 3 == 0) {
                divByThree.add(nums);
            } else if (nums % 2 == 0) {
                divByTwo.add(nums);
            } else if ((nums % 2 != 0) && (nums % 3 != 0)) {
                divByOthers.add(nums);
            }
        }
        printList((ArrayList<Integer>) divByThree);
        printList((ArrayList<Integer>) divByTwo);
        printList((ArrayList<Integer>) divByOthers);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}