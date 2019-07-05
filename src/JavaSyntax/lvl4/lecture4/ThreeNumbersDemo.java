package JavaSyntax.lvl4.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeNumbersDemo {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        int num1 = Integer.parseInt(number1);

        String number2 = reader.readLine();
        int num2 = Integer.parseInt(number2);

        String number3 = reader.readLine();
        int num3 = Integer.parseInt(number3);

        if (num1 == num2 && num2 == num3 && num1 == num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if ((num1 == num2) && (num3 != num1) && (num3 != num2)) {
            System.out.println(num1 + " " + num2);
        } else if ((num1 == num3) && (num2 != num1) && (num2 != num3)) {
            System.out.println(num1 + " " + num3);
        } else if ((num2 == num3) && (num1 != num3) && (num1 != num2)) {
            System.out.println(num2 + " " + num3);
        }
    }
}
