package JavaSyntax.lvl4.lecture4;


import java.util.Scanner;

public class CompareDemo {
    private static char sc;

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число: ");
            compare(sc.nextInt());
    }

    public static void compare(int a) {
        if (a < 5) {
            System.out.println(a + " меньше 5");
        } else if (a > 5) {
            System.out.println(a + " больше 5");
        } else {
            System.out.println(a + " равно 5");
        }

    }
}
