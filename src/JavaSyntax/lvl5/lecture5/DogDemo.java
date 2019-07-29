package JavaSyntax.lvl5.lecture5;

public class DogDemo {

    private String name;
    private int age;

    public static void main(String[] args) {
        DogDemo dogDemo = new DogDemo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
