package JavaSyntax.lvl10.lecture11;

public class HumanExample {
    public static void main(String[] args) {
        Human men = new Human();
        Human women = new Human();

        men.name = "Дмитрий";
        men.surname = "Иванов";
        men.sex = "мужчина";

        System.out.println(men.name + " " + men.surname);
        System.out.println("пол " + men.sex);

        women.name = "Анжелика";
        women.name = "Власова";
        women.sex = "женщина";

        System.out.println(women.name + " " + women.surname);
        System.out.println("пол " + women.sex);

    }

    public static class Human {
        private static String name;
        private static String surname;
        private static int age;
        private static int weight;
        private static int height;
        private static String sex = "мужчина";

        public Human() {
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname, int age, int weight) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, String surname, int age, int weight, int height) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, String surname, int age, int weight, int height, String sex) {
            this(name, surname, age, weight, height);
            this.sex = sex;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int weight, String surname, int age) {
            this.surname = surname;
            this.weight = weight;
            this.age = age;
        }

        public Human(int age, int weight, String sex) {
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }
    }
}
