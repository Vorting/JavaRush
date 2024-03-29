package JavaSyntax.lvl9.lecture11;

import java.io.BufferedReader;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TryCatchMethod {
    public static void main(String[] args) throws IOException {
        readData();

    }

    public static void readData() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();

        try {
            while (numbers.add(Integer.valueOf(reader.readLine()))) ;
        } catch (NumberFormatException nfe) {
            for (Integer element : numbers) {
                System.out.println(element);
            }
        } catch (IOException ioe) {

        }
    }
}
