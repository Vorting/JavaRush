package JavaSyntax.lvl7.lecture12;

import java.io.IOException;

public class ThreadBoomDemo {
    public static void main(String[] args) throws IOException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
        }
        System.out.println("Бум!");
    }
}
