package JavaCore.level1.lecture8;

public class CatDemo {

    public static void main(String[] args) {
        Cat cat = new Cat("Vasya",21, 5);

    }

      static class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat() {
        }

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

    }
}
