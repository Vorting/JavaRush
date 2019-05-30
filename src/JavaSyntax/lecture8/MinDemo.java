package JavaSyntax.lecture8;

public class MinDemo {
    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));

    }


    public static int min(int a, int b) {

        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
