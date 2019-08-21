package JavaSyntax.lvl5.lecture12;

public class M_WDemo {
    public static void main(String[] args) {
        Men man1 = new Men("Dima", 27, "Ukraine, Dnipro, Semafornaya 36 street");
        Men man2 = new Men("Vlad", 25, "Ukraine, Dnipro, Semafornaya 36 street");

        Women woman1 = new Women("Anzhelika", 20, "Ukraine, Dnipro, Zhivopisnaya 89");
        Women woman2 = new Women("Anastasia", 29, "Ukraine, Dnipro, Dievka-2 89");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

    }

    public static class Men {
        private String name;
        private int age;
        private String address;

        public Men() {
        }

        public Men(String name) {
            this.name = name;
        }

        public Men(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Men(String name, int age, String address) {
            this(name, age);
            this.address = address;
        }
    }

    public static class Women {
        private String name;
        private int age;
        private String address;

        public Women() {
        }

        public Women(String name) {
            this.name = name;
        }

        public Women(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Women(String name, int age, String address) {
            this(name, age);
            this.address = address;
        }
    }
}
