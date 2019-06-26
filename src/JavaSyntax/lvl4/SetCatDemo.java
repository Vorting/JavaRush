package JavaSyntax.lvl4;

public class SetCatDemo {

    private static int catsCount = 0;

    public static void main(String[] args) {
        SetCatDemo catDemo = new SetCatDemo();
        catDemo.setCatsCount(100);


    }

    public static void setCatsCount(int catsCount) {
        SetCatDemo.catsCount = catsCount;
    }
}
