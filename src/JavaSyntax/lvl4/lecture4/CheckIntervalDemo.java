package JavaSyntax.lvl4.lecture4;

public class CheckIntervalDemo {
    public static void main(String[] args) {
        CheckIntervalDemo check = new CheckIntervalDemo();
        check.checkInterval(112);
        check.checkInterval(60);
        check.checkInterval(10);

    }


    public static void checkInterval(int a) {
        if (a > 50 && a < 100) {
            System.out.println("Число " + a + " содержится в интервале.");
        } else  {
            System.out.println("Число " + a + " не содержится в интервале.");
        }
    }
}
