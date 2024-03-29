package JavaSyntax.lvl7.lecture7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 10; i++) {
            arrayList.add(0, reader.readLine());
        }

        for (String x : arrayList) {
            System.out.println(x);
        }
    }
}
