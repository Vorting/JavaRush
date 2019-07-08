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

        int max1 , max2 ;
        int max3, max4 ;


        if (num1 > num2 && num1 > num3 && num1 > num4) {
            max1 = num1;
            System.out.println(max1);
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            max2 = num2;
            System.out.println(max2);
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            max3 = num3;
            System.out.println(max3);
        } else if (num4 > num1 && num4 > num2 && num4 > num3) {
            max4 = num4;
            System.out.println(max4);
        }
        else if (num1 == num2 && num2 == num3 && num3 == num4 && num1 == num4) {
            System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
        } else if ((num1 == num2) && (num3 != num1) && (num3 != 2) && (num4 != num2)) {
            System.out.println(num1 + " " + num2);
        } else if ((num1 == num3) && (num2 != num1) && (num2 != num3) && (num2 != num4)) {
            System.out.println(num1 + " " + num3);
        } else if ((num2 == num3) && (num1 != num3) && (num1 != num2) && (num1 != num4)) {
            System.out.println(num2 + " " + num3);
        } else if ((num3 == num4) && (num1 != num3) && (num1 != num4) && (num1 != num2)) {
            System.out.println(num3 + " " + num4);
        }
    }
}
