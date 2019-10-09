package JavaSyntax.lvl7.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListSwitchDemo {
    private static int N = 0;
    private static int M = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();

        N = Integer.parseInt(reader.readLine());
        M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            arrayList.add(i, String.valueOf(N));
            arrayList.add(i, String.valueOf(M));
        }

        System.out.println("arrayList before " + arrayList);

        for (int j = 0; j < N; j++) {
            arrayList.add(M, String.valueOf(arrayList.add(String.valueOf(j))));
        }

        System.out.println("arrayList after " + arrayList);
    }
}
