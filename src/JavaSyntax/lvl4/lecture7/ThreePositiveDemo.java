package JavaSyntax.lvl4.lecture7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreePositiveDemo {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

<<<<<<< HEAD
        if ((number1 > 0 && number2 > 0 && number3 <= 0)) {
            System.out.println(2);
        }
        if ((number2 > 0 && number3 > 0) && number1 <= 0) {
            System.out.println(2);
        }
        if ((number3 > 0 && number1 > 0) && number2 <= 0) {
            System.out.println(2);
        }
        if (number1 < 0 && number2 < 0 && number3 < 0) {
            System.out.println(0);
=======

        if ((number1 > 0 && number2 > 0 && number3 > 0)) {
            System.out.println("3");
        } else if ((number1 > 0 && number2 > 0 && number3 <= 0) || (number2 > 0 && number3 > 0 && number1 <= 0) || (number3 > 0 && number1 > 0 && number2 <= 0)) {
            System.out.println("2");
        } else if (number1 <= 0 && number2 <= 0 && number3 <= 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
>>>>>>> 9afa30cd60a2e7d87fa062843cdfdb8f84bea048
        }
    }
}