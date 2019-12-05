package JavaSyntax.lvl9.lecture6;

public class ExampleExceptionString {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException exception");
        }
    }
}
