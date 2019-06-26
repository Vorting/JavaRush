package JavaSyntax.lvl4.lecture2;

public class CatsCountDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println("создаем первого " + cat1 + " кота");
        Cat.count++;
        Cat cat2 = new Cat();
        System.out.println("создаем второго " + cat2 + " кота");
        Cat.count++;

    }

    public static class Cat {
        public static int count = 0;
    }
}
