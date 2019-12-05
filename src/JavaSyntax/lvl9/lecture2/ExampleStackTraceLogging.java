package JavaSyntax.lvl9.lecture2;

public class ExampleStackTraceLogging {
    public static void main(String[] args) {
        log("In main method");

    }

    public static void log(String s) {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElement[2].getClassName() + ": " +
                stackTraceElement[2].getMethodName() + " : " + s);
    }
}
