package JavaSyntax.lvl6.lecture5;

public class CatDogFinalizeDemo {

    public static void main(String[] args) throws Throwable {

        Cat2 cat = new Cat2();
        Dog2 dog = new Dog2();

        for (int i = 0; i < 20_000; i++) {
            System.out.println(i);
            cat.finalize();
        }
        for (int j = 0; j < 50_000; j++) {
            System.out.println(j);
            dog.finalize();
        }
    }
}

class Cat2 {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog2 {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
