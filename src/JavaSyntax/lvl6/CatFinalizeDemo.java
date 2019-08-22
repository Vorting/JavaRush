package JavaSyntax.lvl6;

public class CatFinalizeDemo {
    public static void main(String[] args) {

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
