package JavaSyntax.lvl8.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MonthNumber {
    public static void main(String[] args) throws IOException {


        HashMap<String, Integer> months = new HashMap<>();

        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String checkMonth = reader.readLine();

        Iterator<Map.Entry<String, Integer>> iterator = months.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pairOfMonths = iterator.next();
            String monthKey = pairOfMonths.getKey();
            Integer monthValue = pairOfMonths.getValue();
            if (monthKey.equals(checkMonth)) {
                System.out.println(monthKey + " is the " + monthValue + " month");
            }
        }
    }
}
