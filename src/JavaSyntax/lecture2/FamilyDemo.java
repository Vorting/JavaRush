package JavaSyntax.lecture2;

public class FamilyDemo {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        woman.husband = man;
        man.wife = woman;
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}
