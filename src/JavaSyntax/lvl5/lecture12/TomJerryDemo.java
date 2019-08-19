package JavaSyntax.lvl5.lecture12;

public class TomJerryDemo {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 100, 8);
        Dog spikeDog = new Dog("Spike", 180, 1);
        Woman mammy = new Woman("Mammy Two Shoes", 200);

        System.out.println(jerryMouse.name + ", " + jerryMouse.height + ", " + jerryMouse.tail);
        System.out.println(tomCat.name + ", " + tomCat.height + ", " + tomCat.tail + ", ");
        System.out.println(spikeDog.name + ", " + spikeDog.height + ", " + spikeDog.tail + " ");
        System.out.print(mammy.name+", "+mammy.height);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

    }

    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }


    public static class Woman {
        String name;
        int height;

        public Woman(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }
}
