package JavaSyntax.lvl6.lecture8;

import java.io.IOException;

public class DistanceDemo {

    public static void main(String[] args) throws IOException {

    }

    public static double getDistanceDemo(int x1, int y1, int x2, int y2) {

        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
