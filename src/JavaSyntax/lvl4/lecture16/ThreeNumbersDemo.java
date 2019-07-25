package JavaSyntax.lvl4.lecture16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeNumbersDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());

        int max = n1;
        int min = n1;
        if (n1 < max && (n2 != n1) && (n2 != n3)) {
            System.out.println(n1);
        } else if (n2 < n3 && (n1 != n2) && (n3 != n2)) {
            System.out.println(n2);
        } else if (n3 < n1 && (n2 != n1) && (n1 != n3)) {
            System.out.println("среднее число " + n3);
        }


    }
}
