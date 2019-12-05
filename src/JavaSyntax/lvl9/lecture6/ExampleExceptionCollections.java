package JavaSyntax.lvl9.lecture6;

import java.util.ArrayList;
import java.util.List;

public class ExampleExceptionCollections {
    public static void main(String[] args) {
        try {
            List<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }
    }
}
