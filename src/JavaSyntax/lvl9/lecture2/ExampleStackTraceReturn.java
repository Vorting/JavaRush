package JavaSyntax.lvl9.lecture2;

public class ExampleStackTraceReturn {

    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        method2();
        return stackTraceElements;
    }

    public static StackTraceElement[] method2() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        method3();
        return stackTraceElements;
    }

    public static StackTraceElement[] method3() {
        StackTraceElement[] stackTraceElememts = Thread.currentThread().getStackTrace();
        method4();
        return stackTraceElememts;
    }

    public static StackTraceElement[] method4() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        method5();
        return stackTraceElements;

    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
    }
}
