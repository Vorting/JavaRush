package JavaSyntax.lvl7.lecture9;

import java.util.ArrayList;

public class AListHard2Demo {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String s : strings) {
            System.out.println(s);
        }
    }

//    private static ArrayList<String> fix(ArrayList<String> strings) {
//        for (int i = 0; i < strings.size() - 1; i++) {
//            if (strings.get(i).contains("р")) {
//                strings.remove(0);
//            } else if (strings.get(i).contains("л")) {
//                strings.add(i, strings.get(i));
//            }
//        }
//        return strings;
//    }

    private static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size() - 1; i++) {
            if (strings.get(i).contains("р")) {
                strings.remove(i);
            }
            if (strings.get(i).contains("р") && strings.get(i).contains("л")) {
                strings.add(i, strings.get(i));
            } else if (!strings.get(i).contains("л") && (!strings.get(i).contains("р"))) {
            }
        }
        return strings;
    }
}
