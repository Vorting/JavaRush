package JavaSyntax.lvl7.lecture12;

public class HumanDemo {


    public static void main(String[] args) {
        Human Dima = new Human("Дмитрий", true, 27);
        Human Kate = new Human("Катя", false, 21);
        Human Anzhelika = new Human("Анжелика", false, 21);
        Human Vlad = new Human("Владислав", true, 24);

        Human Roman = new Human("Роман", true, 24, Vlad, Kate);
        Human Igor = new Human("Игорь", true, 5, Vlad, Kate);
        Human Alex = new Human("Алексей", true, 24, Vlad, Kate);
        Human Maria = new Human("Мария", false, 11, Vlad, Kate);
        Human David = new Human("Давид", true, 3, Dima, Anzhelika);

        System.out.println(Dima);
        System.out.println(Anzhelika);
        System.out.println(Kate);
        System.out.println(Vlad);

        System.out.println(Roman);
        System.out.println(Igor);
        System.out.println(Alex);
        System.out.println(Maria);
        System.out.println(David);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this(name, sex, age);
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            String text = " ";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }
    }
}
