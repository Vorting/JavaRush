package JavaSyntax.lvl9.lecture8;

public class ExampleThreeExceptions {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (Exception3 e3) {
            System.out.println("Exception3");
        } catch (Exception2 e2) {
            System.out.println("Exception2");
        } catch (Exception1 e1) {
            System.out.println("Exception1");
        }
    }

    private static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);

        if (i == 0) {
            throw new Exception1();
        } else if (i == 1) {
            throw new Exception2();
        } else if (i == 2) {
            throw new Exception3();
        }
    }

    private static class Exception1 extends Exception {

    }

    private static class Exception2 extends Exception1 {
    }

    private static class Exception3 extends Exception2 {
    }
}
