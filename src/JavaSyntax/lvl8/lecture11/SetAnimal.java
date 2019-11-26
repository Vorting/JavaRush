package JavaSyntax.lvl8.lecture11;

import java.util.HashSet;
import java.util.Set;

public class SetAnimal {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);

    }

    public static Set<Cat> createCats() {
        Set<Cat> catResult = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            catResult.add(new Cat());
        }
        return catResult;
    }

    private static Set<Dog> createDogs() {
        Set<Dog> dogResult = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            dogResult.add(new Dog());
        }
        return dogResult;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.add(cats);
        pets.add(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object p : pets) {
            System.out.println(p);
        }
    }

    public static class Cat {

    }

    public static class Dog {

    }
}
