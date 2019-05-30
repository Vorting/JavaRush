package JavaSyntax.lecture8;

public class MinV2Demo {

    public static int min(int a, int b, int c) {
        int min;

        min = a;

        if (a < min) {
            min = a;
        } else if (b < min ) {
            min = b;
        } else if (c < min) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
