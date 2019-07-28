package JavaSyntax.lvl5.lecture5;

public class ThreeCatsDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Dima", 27, 65, 50);
        Cat cat2 = new Cat("Barsik", 5, 5, 100);
        Cat cat3 = new Cat("Bobik", 12, 30, 150);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
