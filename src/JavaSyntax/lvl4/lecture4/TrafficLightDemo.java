package JavaSyntax.lvl4.lecture4;

import java.io.IOException;
import java.util.Scanner;

public class TrafficLightDemo {
    private static double third_minute = 3;
    private static double fourth_minute = 3;
    private static double fifth_minute = 5;


    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String hours = reader.readLine();
//        double time = Double.parseDouble(hours);
//
//        guessColor(time);
//
//
//    }
//
//
//    public static double guessColor(double time_in_minutes) {
//        double tmp = 0;
//
//        tmp = time_in_minutes / fifth_minute;
//        if (tmp == fourth_minute) {
//            System.out.println(tmp);
//            System.out.println("зеленый");
//        } else if (tmp ==)
//
//
//            return tmp;
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        int a = (int) (t / 5);
        int e = (int) t;

        int d = e - a * 5;
        switch (d) {
            case 0:

            case 1:
            case 5:

            case 2:
                System.out.println("зелёный");
                break;
            case 3:
                System.out.println("жёлтый");
                break;
            case 4:
                System.out.println("красный");
                break;

        }

    }
}
