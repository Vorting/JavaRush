package JavaSyntax.lvl7.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigA_SmallA_Demo {

    public static void main(String[] args) throws IOException {
        int[] BigA = new int[20];
        int[] SmallA_1 = new int[10];
        int[] SmallA_2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i;
        for (i = 0; i < BigA.length; i++) {
            BigA[i] = Integer.parseInt(reader.readLine());
        }

        for (i = 0; i < SmallA_1.length; i++) {
            SmallA_1[i] = BigA[i];
        }
        for (int j = 0; j < SmallA_2.length; j++) {
            SmallA_2[j] = BigA[10 + j];
        }

        for (int k = 0; k < SmallA_2.length; k++) {
            System.out.println(SmallA_2[k]);
        }
    }
}


