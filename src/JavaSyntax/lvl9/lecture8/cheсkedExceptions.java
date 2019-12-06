package JavaSyntax.lvl9.lecture8;

import java.io.IOException;
import java.rmi.RemoteException;

public class cheсkedExceptions {
    public static void main(String[] args) {

        handleExceptions(new cheсkedExceptions());
    }

    public static void handleExceptions(cheсkedExceptions obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (RemoteException re) {
            System.out.println("Test RemoteException");
        }
        catch (IOException e) {
            System.out.println("Test IOException");
        } catch (NoSuchFieldException nsfe) {
            System.out.println("Test NoSuchFieldException");
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }


}
