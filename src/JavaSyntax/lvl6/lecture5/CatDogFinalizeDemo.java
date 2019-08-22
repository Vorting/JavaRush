package JavaSyntax.lvl6.lecture5;

public class CatDogFinalizeDemo {

    public static void main(String[] args) throws Throwable {


        for (int i = 0; i < 50_000; i++) {

            Cat2 cat = new Cat2();
            Dog2 dog = new Dog2();
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


//==================================
//int count = 0;
//    Cat cat = new Cat(0);
//    Dog dog = new Dog(0);
//        for (count = 1; count < 50_000; count++) {
//        cat.generator(count);
//        dog.generator(count);
//    }
//}
//}
//
//class Cat {
//    private int x;
//    private String name;
//
//    public Cat(String name) {
//        this.name = name;
//    }
//
//    public Cat(int x) {
//        this.x = x;
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//        System.out.println("A Cat was destroyed");
//    }
//
//    void generator(int i) {
//        Cat c = new Cat(i);
//    }
//}
//
//class Dog {
//    private int x;
//    private String name;
//
//    public Dog(String name) {
//        this.name = name;
//    }
//
//    public Dog(int x) {
//        this.x = x;
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//        System.out.println("A Dog was destroyed");
//    }
//
//    void generator(int i) {
//        Dog d = new Dog(i);
//    }    
}
