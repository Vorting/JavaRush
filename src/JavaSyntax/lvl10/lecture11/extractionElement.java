package JavaSyntax.lvl10.lecture11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class extractionElement {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {

            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }
        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(List<Integer> list, int index, int defaultValue) {
        int resultIndex = defaultValue;
        try {
            resultIndex = list.get(index);
        } catch (Exception e) {
            System.out.println("Ошибка поиска. Вы пытаетесь найти отрицательный индекс");
        }
        return resultIndex;
    }
}
