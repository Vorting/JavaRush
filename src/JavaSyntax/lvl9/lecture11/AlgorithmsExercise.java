package JavaSyntax.lvl9.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlgorithmsExercise {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        try {
            while (true) {
                String s = reader.readLine();
                if (s.isEmpty()) {
                    break;
                }
                list.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    private static void sort(String[] array) {
        List<String> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        if (isNumber(String.valueOf(array))) {
            for (String integerEl : array) {
                integerList.add(integerEl);
            }
        } else if (isGreaterThan(String.valueOf(integerList), String.valueOf(integerList)){
            for (String stringEl : array) {
                stringList.add(stringEl);
            }
        }


        isGreaterThan(String.valueOf(stringList), String.valueOf(integerList));
        isNumber(String.valueOf(integerList));

    }

    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Если строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или если символ не содержит цифру и не начинается с '-'
                    || (chars.length == 1 && c == '-'))  // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
