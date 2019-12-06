package JavaSyntax.lvl9.lecture8;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FourExceptions {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (MyException2 exception2) {
            System.out.println("exception2");
        } catch (MyException exception1) {
            System.out.println("exception1");
        } catch (MyException4 exception4) {
            System.out.println("exception4");
        } catch (MyException3 exception3) {
            System.out.println("exception3");
        }

    }

    public static void method1() throws IOException, FileNotFoundException, NumberFormatException, IndexOutOfBoundsException {

        int i = (int) (Math.random() * 4);

        if (i == 0) {
            throw new FourExceptions.MyException();
        } else if (i == 1) {
            throw new FourExceptions.MyException2();
        } else if (i == 2) {
            throw new FourExceptions.MyException3();
        } else if (i == 4) {
            throw new FourExceptions.MyException4();
        }
    }

    static class MyException extends IOException {
    }

    static class MyException2 extends FileNotFoundException {
    }

    static class MyException3 extends IndexOutOfBoundsException {
    }

    static class MyException4 extends NumberFormatException {
    }
}
