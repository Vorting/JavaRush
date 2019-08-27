package JavaSyntax.lvl6.lecture8;

public class CatStaticDemo {
    private static int catCount = 0;


    public CatStaticDemo() {
        catCount++;
    }

    public static void main(String[] args) {

    }

    public int getCatCount() {
        return catCount;
    }

    public void setCatCount(int catCount) {
        CatStaticDemo.catCount = catCount;
    }
}
