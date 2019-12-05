package JavaSyntax.lvl9.lecture6;

import java.util.HashMap;

public class ExampleExceptionMap {
    public static void main(String[] args) {
        try {
            HashMap map = new HashMap(null);
            map.put(null, null);
            map.remove(null);
        }catch (NullPointerException ex) {
            System.out.println("NullPointerException");
        }
    }
}
