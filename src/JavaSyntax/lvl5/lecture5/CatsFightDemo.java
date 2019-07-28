package JavaSyntax.lvl5.lecture5;

public class CatsFightDemo {
    public int age;
    public int weight;
    public int strength;

    public CatsFightDemo() {
    }

    public boolean fight(CatsFightDemo anotherCat) {
        int c1 = 0;
        int c2 = 0;
        if (this.age > anotherCat.age) {
            c1++;
        } else if (this.age == anotherCat.age) {
            c1++;
            c2++;
        } else {
            c2++;
        }
        if (this.weight > anotherCat.weight) {
            c1++;
        } else if (this.weight == anotherCat.weight) {
            c1++;
            c2++;
        } else {
            c2++;
        }
        if (this.strength > anotherCat.strength) {
            c1++;
        } else if (this.strength == anotherCat.strength) {
            c1++;
            c2++;
        } else {
            c2++;
        }
        if (c1 > c2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CatsFightDemo cat1 = new CatsFightDemo();
        CatsFightDemo cat2 = new CatsFightDemo();
        System.out.println("до инициализации значений");
        System.out.println(cat1.fight(cat2));

        System.out.println("после инициализации значений");
        cat1.age = 5;
        cat1.weight = 5;
        cat1.strength = 8;

        cat2.age = 26;
        cat2.weight = 65;
        cat2.strength = 80;
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
