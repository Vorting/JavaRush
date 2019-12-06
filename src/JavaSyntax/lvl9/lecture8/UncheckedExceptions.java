package JavaSyntax.lvl9.lecture8;

public class UncheckedExceptions {
    public static void main(String[] args) {
        handleExceptions(new UncheckedExceptions());
    }

    public static void handleExceptions(UncheckedExceptions obj) {
        obj.method1();
        try {

            obj.method2();
            obj.method3();
        } catch (NullPointerException | IndexOutOfBoundsException | NumberFormatException e) {
            printStack(e);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }
}
