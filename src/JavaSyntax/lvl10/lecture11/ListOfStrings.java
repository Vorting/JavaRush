package JavaSyntax.lvl10.lecture11;

import java.util.ArrayList;
import java.util.List;

public class ListOfStrings {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {

        ArrayList<String>[] list = new ArrayList[12];
        for (int i = 0; i < list.length; i++) {
            ArrayList<String> list2 = new ArrayList<>();
            list2.add("образец текста №" +(i+1));
            list[i] = list2;
        }
        return list;
    }

    public static void printList(List<String>[] arrayOfStringList) {
        for (List<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
