package JavaSyntax.lvl8.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CitiesListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }
            list.add(family);
        }

        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }
    }
}
