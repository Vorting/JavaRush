package JavaSyntax.lvl8.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CitiesListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> familiesAndCities = new HashMap<>();

        while (true) {

            String readCity = reader.readLine();
            if (readCity.isEmpty()) {
                break;
            }
            String familyManName = reader.readLine();
            familiesAndCities.put(readCity, familyManName);
        }

        String checkCity = reader.readLine();

        for (Map.Entry<String, String> pair : familiesAndCities.entrySet()) {
            if (pair.getKey().equals(checkCity)) {
                System.out.println(pair.getValue());
            }
        }
    }
}
