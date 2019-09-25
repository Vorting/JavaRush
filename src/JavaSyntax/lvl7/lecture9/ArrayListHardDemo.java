package JavaSyntax.lvl7.lecture9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListHardDemo {
    public static void main(String[] args) throws IOException {
        List<Integer> mainArray = new ArrayList<>();
        List<Integer> divByThree = new ArrayList<>();
        List<Integer> dibByTwo = new ArrayList<>();
        List<Integer> divByOthers = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            mainArray.add(Integer.valueOf(reader.readLine()));
        }
        

    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                System.out.println(list.get(i));
            }
        }
    }
}
