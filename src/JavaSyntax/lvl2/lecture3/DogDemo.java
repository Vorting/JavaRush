package JavaSyntax.lvl2.lecture3;

public class DogDemo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Max";
        Dog dog2 = new Dog();

        Dog dog3 = new Dog();
        dog2.name = "Bella";
        dog3.name = "Jack";
    }

    public static class Dog {
        public String name;
    }
}
