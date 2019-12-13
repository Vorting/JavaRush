package JavaSyntax.lvl9.lecture11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfNumbers {
    public static void main(String[] args) {
        List<int[]> numbersArray = createList();
        printList(numbersArray);
    }

    private static List<int[]> createList() {
        List<int[]> arrayList = new ArrayList<>();
        int[] firstArr = {1, 2, 3, 4, 5};
        int[] secondArr = {1, 2};
        int[] thirdArr = {1, 2, 3, 4};
        int[] fourthArr = {1, 2, 3, 4, 5, 6, 7};
        int[] fifthArr = {};

        arrayList.add(firstArr);
        arrayList.add(secondArr);
        arrayList.add(thirdArr);
        arrayList.add(fourthArr);
        arrayList.add(fifthArr);
        return arrayList;
    }

    public static void printList(List<int[]> list) {
        for (int[] array : list) {
            System.out.println();
            for (int x : array) {
                System.out.print(x);
            }
        }
    }
}
