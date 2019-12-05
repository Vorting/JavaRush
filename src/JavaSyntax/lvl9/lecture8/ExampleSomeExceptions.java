package JavaSyntax.lvl9.lecture8;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class ExampleSomeExceptions {
    public static void main(String[] args) throws Exception {
        try {

            method1();

        } catch (NullPointerException npe) {
            System.out.println("NullPointerException");

        } catch (FileNotFoundException fnfe) {
            System.out.println("FileNotFoundException");
        }
    }

    private static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0) {
            throw new NullPointerException();
        } else if (i == 1) {
            throw new ArithmeticException();
        } else if (i == 2) {
            throw new FileNotFoundException();
        } else if (i == 3) {
            throw new URISyntaxException("", "");
        }
    }
}
