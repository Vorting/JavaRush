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

    public static void readData() throws CharConversionException, NumberFormatException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            List<String> numbers = new ArrayList<>();

            try {
                numbers.add(reader.readLine());
            } catch (IOException ) {
                e.printStackTrace();
            }

        } catch (NumberFormatException formatException) {
            formatException.getMessage();
        }


    }
}
