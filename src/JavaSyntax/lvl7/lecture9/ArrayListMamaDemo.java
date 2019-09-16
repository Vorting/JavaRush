package JavaSyntax.lvl7.lecture9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMamaDemo {
    public static void main(String[] args) {
        List<String> textList = new ArrayList<>();
        String exactly = "именно";

        textList.add("мама");
        textList.add("мыла");
        textList.add("раму");

        for (int i = 0; i < textList.size(); i += 2) {
            textList.add(i + 1, exactly);
        }

        for (String s : textList) {
            System.out.println(s);
        }
    }
}
