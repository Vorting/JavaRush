package JavaSyntax.lvl9.lecture6;

public class ExampleExceptionNumbers {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("XYZ");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
    }
}
