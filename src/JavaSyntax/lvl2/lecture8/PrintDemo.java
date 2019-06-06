package JavaSyntax.lvl2.lecture8;

public class PrintDemo {
    public static void main(String[] args) {
        print3("I love you!");
    }

    public static void print3(String s) {
        int counter = 3;
        while (counter != 0) {
            System.out.println(s);
            counter--;
        }
    }
}
