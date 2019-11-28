package JavaSyntax.lvl8.lecture11;

import java.util.Date;

public class IsDateOddDemo {
    public static void main(String[] args) {

        //        System.out.println(isDateOdd("JANUARY 1 2000"));
//        System.out.println(isDateOdd("JANUARY 2 2020"));
        System.out.println(isDateOdd("MAY 1 2013"));

    }

    public static boolean isDateOdd(String date) {
        Date dateStart = new Date(date);
        Date dateFinish = new Date(date);
        dateStart.setMonth(0);//месяц январь, нумерация для месяцев 0-11
        dateStart.setDate(1); // первое число


        long msTimeDistance = dateFinish.getTime() - dateStart.getTime();
        long msDay = 24 * 60 * 60 * 1000; // сколько миллисекунд в одних сутках

        long dayCount = (msTimeDistance / msDay) + 1; // кол-во целых дней

        if (dayCount % 2 != 0) {
            return true;
        }
        return false;
    }
}
