package JavaSyntax.lvl4.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYearDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите год: ");

        String year = reader.readLine();
        int number = Integer.parseInt(year);
        leapYearCounter(number);
    }

    public static int leapYearCounter(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " количество дней в году: 366");

        } else {
            System.out.println(year + " количество дней в году: 365");
        }


        return year;
    }
}
