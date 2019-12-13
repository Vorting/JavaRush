package JavaSyntax.lvl9.lecture11;

import java.util.*;

public class CatMap {
    public static void main(String[] args) {

        Map<String, Cat> catVocabulary = createMap();
        Set<Cat> set = convertMapToSet(catVocabulary);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> catsName = new HashMap<>();
        for (int i = 0; i < 19; i++) {
            catsName.put("Барсик" + i, new Cat(" " + i++));
        }
        return catsName;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
