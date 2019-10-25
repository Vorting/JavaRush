package JavaSyntax.lvl8.lecture6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVSLinkedDemo {
    public static Object createArrayList() {
        List arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }

    public static Object createLinkedList() {
        List linkedList = new LinkedList();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        return linkedList;
    }

    public static void main(String[] args) {

    }
}
