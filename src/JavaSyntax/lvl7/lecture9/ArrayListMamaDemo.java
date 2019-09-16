package JavaSyntax.lvl7.lecture9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMamaDemo {
    public static void main(String[] args) {
        List<String> textList = new ArrayList<>();
        String exactly = "именно";

        textList.add("мама");
        textList.add(exactly);
        textList.add("мыла");
        textList.add(exactly);
        textList.add("раму");
        textList.add(exactly);

        for (String s : textList) {
            System.out.println(s);
        }
    }
}
