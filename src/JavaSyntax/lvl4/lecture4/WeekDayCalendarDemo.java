package JavaSyntax.lvl4.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekDayCalendarDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите день недели: ");

        String day = reader.readLine();
        int number = Integer.parseInt(day);

        weekSwitcher(number);

    }


    public static int weekSwitcher(int num) {

        switch (num) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота, - выходной");
                break;
            case 7:
                System.out.println("Воскресенье, - выходной");
                break;

            default:
                System.out.println("Такого дня недели не существует");
        }

        return num;
    }
}
