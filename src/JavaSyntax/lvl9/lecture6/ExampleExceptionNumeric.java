package JavaSyntax.lvl9.lecture6;

public class ExampleExceptionNumeric {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        }catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя!");
        }
    }
}
