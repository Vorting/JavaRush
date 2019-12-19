package JavaSyntax.lvl9.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CurrentDateTime {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dataInputString = reader.readLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;

        try {
            date = dateFormat.parse(dataInputString);
            SimpleDateFormat dateFormat2 = new SimpleDateFormat(" MMM dd, yyyy", Locale.ENGLISH);
            System.out.println(dateFormat2.format(date).toUpperCase());
        } catch (ParseException e) {
            System.out.println(e);
        }
    }
}
