package JavaSyntax.lvl4.lecture7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumsDemo {


    public static void main(String[] args) throws IOException {
        int number;
        int counter = 0;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        number = Integer.parseInt(reader.readLine());

        while (number != 0) {
            counter += 1;
            number /= 10;
        }

        if (counter == 1 && (number % 2 == 0)) {
            System.out.println("четное однозначное число");
        } else {
            System.out.println("нечетное однозначное число");
        }
        if (counter == 2 && (number % 2 == 0)) {
            System.out.println("четное двузначное число");
        } else {
            System.out.println("нечетное двузначное число");
        }
        if (counter == 3 && (number % 2 == 0)) {
            System.out.println("четное трехзначное число");
        } else {
            System.out.println("нечетное трехзначное число");
        }
    }
}
