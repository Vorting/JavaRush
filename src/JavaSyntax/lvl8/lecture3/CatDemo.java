package JavaSyntax.lvl8.lecture3;

import java.awt.event.MouseAdapter;
import java.util.HashMap;
import java.util.Map;

public class CatDemo {

    public static void main(String[] args) {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый",
                "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> hashMap = addCatsToMap(cats);

        for (Map.Entry<String, Cat> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static Map<String, Cat> addCatsToMap(String[] cats) {
        Map<String, Cat> catMap = new HashMap<>();
        catMap.putAll();

    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }

}
}
