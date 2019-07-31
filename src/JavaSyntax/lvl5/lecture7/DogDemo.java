package JavaSyntax.lvl5.lecture7;

public class DogDemo {

    private String name = null;
    private int height;
    private String color;

    public static void main(String[] args) {
        DogDemo dog = new DogDemo();
        DogDemo dog2 = new DogDemo();
        DogDemo dog3 = new DogDemo();
        dog.initialize("Fido");
        dog2.initialize("Borya", 150);
        dog3.initialize("Tolya", 150, "BLUE");
    }

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
