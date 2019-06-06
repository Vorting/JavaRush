package JavaSyntax.lvl3;

public class DivDemo {
    public static void main(String[] args) {
        div(6, 3);
        div(10, 6);
        div(2, 4);

    }

    public static void div(int a, int b) {
        int result = 0;
        result = a / b;
        System.out.println("ваш ответ "+result);
    }
}
