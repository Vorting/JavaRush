package JavaSyntax.lecture8;

public class MinV2Demo {

    public static int min(int a, int b, int c) {
        int min;

        min = a;

        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else if (c <= a && c <= b) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(2, 1, 1)); // по этой строчке поймем получилось или нет)

    }
}
