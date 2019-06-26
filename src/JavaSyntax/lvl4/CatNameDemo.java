package JavaSyntax.lvl4;

public class CatNameDemo {
    private String name;

    public static void main(String[] args) {
        CatNameDemo cat = new CatNameDemo();

        cat.name = "Vasya";
        System.out.println(cat.getName());
        cat.setName("Baba");
        System.out.println(cat.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
