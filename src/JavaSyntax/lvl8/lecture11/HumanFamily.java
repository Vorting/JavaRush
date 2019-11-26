package JavaSyntax.lvl8.lecture11;

import java.util.ArrayList;

public class HumanFamily {
    public static void main(String[] args) {
        ArrayList<Human> children = new ArrayList<>();
        ArrayList<Human> parentFather = new ArrayList<>();
        ArrayList<Human> parentMother = new ArrayList<>();

        Human child = new Human("Маргарита", true, 22, null);
        Human child2 = new Human("Мина", false, 6, null);
        Human child3 = new Human("Маргарита", true, 27, null);

        children.add(child);
        children.add(child2);
        children.add(child3);

        Human dad = new Human("Отец", true, 54, children);
        Human mom = new Human("Мама", false, 55, children);


        parentFather.add(dad);
        parentMother.add(mom);

        Human grandpa = new Human("Дедушка 1", true, 80, parentFather);
        Human grandpa2 = new Human("Дедушка 2", true, 78, parentMother);
        Human grandma = new Human("Бабушка 1", false, 75, parentFather);
        Human grandma2 = new Human("Бабушка 2", false, 74, parentMother);


        System.out.println(grandpa);
        System.out.println(grandma);
        System.out.println(grandpa2);
        System.out.println(grandma2);

        System.out.println(mom);
        System.out.println(dad);

        System.out.println(child);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.children == null) {
                return text;
            }

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
