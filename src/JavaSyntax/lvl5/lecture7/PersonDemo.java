package JavaSyntax.lvl5.lecture7;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Kolya", 12);

    }

    static class Person {
        private String name;
        private int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
