package JavaSyntax.lvl9.lecture8;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class BeanExceptions {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try {
            handleExceptions();
        } catch (IOException exception) {
            BEAN.log(exception);
        }
    }

    public static void handleExceptions() throws FileSystemException {

        try {
            BEAN.methodThrowExceptions();
        } catch (FileSystemException fse) {
            BEAN.log(fse);
            throw fse;
        } catch (CharConversionException e) {
            BEAN.log(e);
        } catch (IOException e) {
            BEAN.log(e);
        }

    }

    public static class StatelessBean {
        public void log(Exception ex) {
            System.out.println(ex.getMessage() + ", " + ex.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0) {
                throw new CharConversionException();
            } else if (i == 1) {
                throw new FileSystemException("");
            } else if (i == 2) {
                throw new IOException();
            }
        }
    }
}
