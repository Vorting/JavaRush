package JavaSyntax.lvl6.lecture5;

public class CatDogDemo {
    public static void main(String[] args) {
        CatDogDemo cat = new CatDogDemo();
        Dog dog = new Dog();

        cat.finalize();
        dog.finalize();
    }

    protected void finalize() {
        System.out.println("A cat was destroyed");
    }
}

class Dog {
    protected void finalize() {
        System.out.println("A dog was destroyed");
    }
}







