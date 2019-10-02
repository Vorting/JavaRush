package JavaSyntax.lvl7.lecture9;

import java.util.ArrayList;

public class AListHard2Demo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> resultStrings = new ArrayList<>();
        for (String s : strings) {
            if (s.contains("р") && s.contains("л")) {
                resultStrings.add(s);
            } else if (s.contains("р")) {

            } else if (s.contains("л")) {
                resultStrings.add(s);
                resultStrings.add(s);
            } else {
                resultStrings.add(s);
            }
        }
        return resultStrings;
    }
}
