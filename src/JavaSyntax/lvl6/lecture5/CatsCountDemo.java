package JavaSyntax.lvl6.lecture5;

public class CatsCountDemo {
    public static int catCount = 0;

    public CatsCountDemo() {
        catCount++;
    }

    public static void main(String[] args) {

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        catCount--;
    }
}
