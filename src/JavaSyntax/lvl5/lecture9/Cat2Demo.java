package JavaSyntax.lvl5.lecture9;

public class Cat2Demo {
    private String name;
    private int weight;
    private int age;
    private String address;
    private String color;

    public Cat2Demo(String name) {
        this.name = name;
        this.age = 5;
        this.color = "Blue";
        this.weight = 7;
    }

    public Cat2Demo(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Green";
    }

    public Cat2Demo(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 50;
        this.color = "Black";
    }

    public Cat2Demo(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 1;
    }

    public Cat2Demo(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 1;
    }

    public static void main(String[] args) {

    }
}
