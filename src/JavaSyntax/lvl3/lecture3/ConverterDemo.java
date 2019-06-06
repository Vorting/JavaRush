package JavaSyntax.lvl3.lecture3;

public class ConverterDemo {

    private static double dollarUS = 0;

    public static void main(String[] args) {

        System.out.println(convertEurToUsd(100, 1.12));
        System.out.println(convertEurToUsd(80, 1.12));
    }

    public static double convertEurToUsd(int eur, double course) {

        return dollarUS = eur * course;
    }
}
