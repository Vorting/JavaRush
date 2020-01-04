package JavaSyntax.lvl9.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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

        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        for (String integerEl : array) {
            if (isNumber(integerEl)) {
                integerList.add(Integer.valueOf(integerEl));
            } else {
                stringList.add(integerEl);
            }
        }

        for (int i = 0; i < stringList.size(); i++) {
            for (int j = 0; j < stringList.size() - i - 1; j++) {
                if (isGreaterThan(stringList.get(j), stringList.get(j + 1))) {
                    String current = stringList.get(j);
                    stringList.set(j, stringList.get(j + 1));
                    stringList.set(j + 1, current);
                }
            }
        }

        for (int i = 0; i < integerList.size(); i++) {
            for (int j = 0; j < integerList.size() - i - 1; j++) {
                if (integerList.get(j) < integerList.get(j + 1)) {
                    int current = integerList.get(j);
                    integerList.set(j, integerList.get(j + 1));
                    integerList.set(j + 1, current);
                }
            }
        }
        int num_idx = 0;
        int char_idx = 0;

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = String.valueOf(integerList.get(num_idx));
                num_idx++;
            } else {
                array[i] = stringList.get(char_idx);
                char_idx++;
            }
        }

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
