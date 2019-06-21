package JavaSyntax.lvl3.lecture12;

public class NumOf3Demo {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum = 0;
        for (; number != 0; number /= 10) {
            sum = sum + (number % 10);
        }
        return sum;
    }
}
