package JavaSyntax.lvl9.lecture2;

public class ExStackTraceAtNumber {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        StackTraceElement[] entryInTrace = Thread.currentThread().getStackTrace();
        method2();
        System.out.println(entryInTrace[2].getLineNumber());
        return entryInTrace[2].getLineNumber();
    }

    public static int method2() {
        StackTraceElement[] entryInTrace = Thread.currentThread().getStackTrace();
        method3();
        System.out.println(entryInTrace[2].getLineNumber());
        return entryInTrace[2].getLineNumber();
    }

    public static int method3() {
        StackTraceElement[] entryInTrace = Thread.currentThread().getStackTrace();
        method4();
        System.out.println(entryInTrace[2].getLineNumber());
        return entryInTrace[2].getLineNumber();
    }

    public static int method4() {
        StackTraceElement[] entryInTrace = Thread.currentThread().getStackTrace();
        method5();
        System.out.println(entryInTrace[2].getLineNumber());
        return entryInTrace[2].getLineNumber();
    }

    public static int method5() {

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getLineNumber());
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element);
//        }
        return stackTraceElements[2].getLineNumber();
    }
}
