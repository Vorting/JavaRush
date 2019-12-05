package JavaSyntax.lvl9.lecture6;

public class ExampleExceptionArrays {
    public static void main(String[] args) {
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException exception");
        }
    }
}
