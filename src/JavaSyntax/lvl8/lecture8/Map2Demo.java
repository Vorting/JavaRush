package JavaSyntax.lvl8.lecture8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Map2Demo {
    public static void main(String[] args) throws ParseException {

        createMap();

    }

    public static Map<String, Date> createMap() throws ParseException {

        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне",  new Date("MAY 1 2012"));
        map.put("Ivanov",  new Date(" JUNE 11 1992"));
        map.put("Sinclar",  new Date("MAY 10 1969"));
        map.put("Tyson",  new Date("JUNE 30 1966"));
        map.put("Cruise",  new Date("JULY 3 1962"));
        map.put("Roth",  new Date("MAY 14 1961"));
        map.put("Capaldi",  new Date("OCTOBER 7 1996"));
        map.put("Karol",  new Date("JANUARY 25 1985"));
        map.put("Lucas",  new Date("MAY 14 1944"));
        map.put("Diesel",  new Date("JULY 18 1967"));

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            String key = pair.getKey();
            Date value = pair.getValue();
            System.out.println(key + " : " + value);
        }
        return map;

    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8) {
                iterator.remove();
            }
        }
    }
}
