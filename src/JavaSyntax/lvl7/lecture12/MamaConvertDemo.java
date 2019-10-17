package JavaSyntax.lvl7.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MamaConvertDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        while (true) {
            String name = reader.readLine();
            if (name == null || name.isEmpty()) {
                break;
            }
            strings.add(name);
        }

        for (String s : convertFix(strings)) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> convert(ArrayList<String> list) {
        ArrayList<String> resultString = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            resultString.add(s.toUpperCase());
        }
        return resultString;
    }

    public static ArrayList<String> convertFix(ArrayList<String> list) {
        ArrayList<String> resultFixString = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length() % 2 != 0) {
                int count = 0;
                while (count != 3) {
                    resultFixString.add(s);
                    count++;
                }
            } else {
                resultFixString.add(s);
                resultFixString.add(s);
            }
        }
        return resultFixString;
    }
}
