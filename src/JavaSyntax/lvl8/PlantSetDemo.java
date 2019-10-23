package JavaSyntax.lvl8;

import java.util.HashSet;
import java.util.Set;

public class PlantSetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("арбуз");
        hashSet.add("банан");
        hashSet.add("вишня");
        hashSet.add("груша");
        hashSet.add("дыня");
        hashSet.add("ежевика");
        hashSet.add("женьшень");
        hashSet.add("земляника");
        hashSet.add("ирис");
        hashSet.add("картофель");

        for (String name : hashSet) {
            System.out.println(name);
        }
    }
}
