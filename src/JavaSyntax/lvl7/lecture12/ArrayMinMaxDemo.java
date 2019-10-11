package JavaSyntax.lvl7.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayMinMaxDemo {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];


        int minimum = 0;
        int maximum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            if (array[i] < minimum) {
                minimum = array[i];
            } else if (array[i] > maximum) {
                maximum = array[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
