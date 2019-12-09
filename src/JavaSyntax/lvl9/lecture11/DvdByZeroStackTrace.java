package JavaSyntax.lvl9.lecture11;

public class DvdByZeroStackTrace {
    public static void main(String[] args) throws Exception {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() {
//        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        double result = 144 / 0;
        System.out.println(result);
    }
}
