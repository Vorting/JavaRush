package JavaSyntax.lvl4.lecture6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxOfFourth {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число и нажмите \'enter\':");

        String number1 = reader.readLine();
        int num1 = Integer.parseInt(number1);

        String number2 = reader.readLine();
        int num2 = Integer.parseInt(number2);

        String number3 = reader.readLine();
        int num3 = Integer.parseInt(number3);

        String number4 = reader.readLine();
        int num4 = Integer.parseInt(number4);


        if ((num1 > num2) && (num1 > num3) && (num1 > num4)) {
            System.out.println(num1);
        } else if ((num2 > num3) && (num2 > num4)) {
            System.out.println(num2);
        } else if (num3 > num4) {
            System.out.println(num3);
        } else  {
            System.out.println(num4);
        }
    }
}
