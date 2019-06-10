package JavaSyntax.lvl3.lecture5;

public class convertToSecondsDemo {
    private static int seconds_in_hour = 3600;

    public static void main(String[] args) {
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(3));
    }


    public static int convertToSeconds(int hour) {
        int seconds = seconds_in_hour * hour;
        return seconds;
    }
}
