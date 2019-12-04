package JavaSyntax.lvl9.lecture2;

public class ExStackTraceDepth {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElement.length);
        return stackTraceElement.length;
    }
}
