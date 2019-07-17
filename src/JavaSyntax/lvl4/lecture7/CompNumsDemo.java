package JavaSyntax.lvl4.lecture7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompNumsDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();

        int number = Integer.parseInt(line);

        if (number < 0) {
            if (number % 2 == 0) {
                System.out.println("отрицательное четное число");
            } else {
                System.out.println("отрицательное нечетное");
            }
        }
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("положительное четное число");
            } else {
                System.out.println("положительное нечетное число");
            }
        }
        if (number == 0) {
            System.out.println("ноль");
        }
    }
}
