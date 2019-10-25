package JavaSyntax.lvl8.lecture6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVSLinkedDemo {
    public static void main(String[] args) {
        List<Integer> resultList = new ArrayList<>();

        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            resultList.add(i);
        }

        createArrayList(resultList);
        for (Integer i : resultList) {
            System.out.println(i);
        }
    }

    public static List<Integer> createArrayList(List<Integer> list) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer i : list) {
            arrayList.add(i);
        }
        return list;
    }

    public List<Integer> createLinkedList(List<Integer> list) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer i : list) {
            linkedList.add(i);
        }
        return list;
    }
}
