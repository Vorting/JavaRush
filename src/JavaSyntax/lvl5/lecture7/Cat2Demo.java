package JavaSyntax.lvl5.lecture7;

public class Cat2Demo {
    private String name = null;
    private String address = null;
    private String color;
    private int weight;
    private int age;

    public static void main(String[] args) {
        Cat2Demo cat = new Cat2Demo();
        cat.initialize("Kitty");
        System.out.println(cat.name);
        System.out.println();
        Cat2Demo cat2 = cat;
        cat2.initialize("Benya", 5, 4);
        System.out.println(cat2.name + "\nw:" + cat2.weight + ", a:" + cat2.age);
        System.out.println();
        cat.initialize(" ", 10);
        System.out.println(cat.name + ", " + cat.age);
        System.out.println();
        cat.initialize(8, "brown");
        System.out.println(cat.age + ", " + cat.color);
        System.out.println();
        cat.initialize(3, "white", "Dnipro");
        System.out.println(cat.age + ", " + cat.color + ", " + cat.address);

        cat.initialize(3, "Green");
        System.out.println(cat.weight + ", " + cat.color);
        System.out.println();
        cat.initialize(3, "Green", "Kyiv");
        System.out.println(cat.weight + ", " + cat.color);
    }

    public void initialize(String name) {
        this.name = name;
        this.age = 2;
        this.weight = 3;
        this.color = "Blue";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Red";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 13;

    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 9;
    }
}
