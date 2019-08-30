package JavaSyntax.lvl6.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatsRelationshipDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat catGrandpa = new Cat(grandpaName, null, null);

        String grannyName = reader.readLine();
        Cat catGranny = new Cat(grannyName, null, null);

        String daddyName = reader.readLine();
        Cat catFather = new Cat(daddyName, null, catGrandpa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGranny, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandpa);
        System.out.println(catGranny);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        }

        Cat(String name, Cat mother, Cat father) {
            this(name, mother);
            this.father = father;
        }


        @Override
        public String toString() {
            if (mother == null && father == null) {
                return "The cat's name is " + name + ", no mother, no father ";
            } else if ((father != null && mother==null)) {
                return "The cat's name is " + name + ", no mother, father is " + father.name;
            } else if (mother != null && father==null) {
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            } else {
                return "The cat's name is " + name + ", mother is " + mother.name + ", " + "father is " + father.name;
            }
        }
    }
}

