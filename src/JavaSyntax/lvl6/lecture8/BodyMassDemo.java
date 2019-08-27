package JavaSyntax.lvl6.lecture8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BodyMassDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());
        Body.calculateMassIndex(weight, height);

    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double indexMassBody = weight / (height * height);
            if (indexMassBody < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");
            } else if (indexMassBody > 18.5 && indexMassBody < 25) {
                System.out.println("Нормальный вес: между 18.5 и 25");
            } else if (indexMassBody > 25 && indexMassBody < 30) {
                System.out.println("Избыточный вес: между 25 и 30");
            } else {
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}
