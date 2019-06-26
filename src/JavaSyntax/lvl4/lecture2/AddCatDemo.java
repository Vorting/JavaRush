package JavaSyntax.lvl4.lecture2;

public class AddCatDemo {
    private static int catsCount = 0;

    public static void main(String[] args) {
        AddCatDemo cat = new AddCatDemo();
        System.out.println("Размер котика до увеличения " + catsCount);
        System.out.println("Размер котика после увеличения ");
        addNewCat();
        System.out.println(catsCount);

    }

    public static void addNewCat() {
        catsCount++;
    }
}
