package JavaSyntax.lvl4.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите 1-ую сторону треугольника: ");
        String side_a = reader.readLine();

        System.out.println("Введите 2-ую сторону треугольника: ");
        String side_b = reader.readLine();

        System.out.println("Введите 3-ую сторону треугольника: ");
        String side_c = reader.readLine();

        int side_A = Integer.parseInt(side_a);
        int side_B = Integer.parseInt(side_b);
        int side_C = Integer.parseInt(side_c);

        checkSides(side_A, side_B, side_C);
    }

    public static void checkSides(int a, int b, int c) {
        int sum_A_B;
        sum_A_B = a + b;
        int sum_A_C;
        sum_A_C = a + c;
        int sum_B_C;
        sum_B_C = b + c;
        if (sum_B_C > a && sum_A_C > b && sum_A_B > c) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}
