package JavaSyntax.lvl2.lecture8;

public class MinV3Demo {
    public static void main(String[] args) {

        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }

    public static int min(int a, int b) {

        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b, int c, int d) {

        return min(a, b) < min(c, d) ? min(a, b) : min(c, d);
    }
}
