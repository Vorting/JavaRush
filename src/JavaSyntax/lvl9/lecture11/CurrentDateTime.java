package JavaSyntax.lvl9.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class CurrentDateTime {
    public static void main(String[] args) throws IOException {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        SimpleDateFormat dateFormat2 = new SimpleDateFormat();

        System.out.println("Your current time: " + currentDate);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String savedDate = null;
        String savedDate2 = null;
        try {
            savedDate = dateFormat.format(reader.readLine());
            savedDate = dateFormat2.format(reader.readLine());
        } catch (IllegalArgumentException e) {
            System.out.println("Невозможно отформатировать данный объект как дату");
            savedDate = dateFormat.format(reader.readLine());
            savedDate2 = dateFormat2.format(reader.readLine());
            System.out.println("Your typed data: " + savedDate.toUpperCase());
            System.out.println("Your typed data: " + savedDate2.toUpperCase());
        }
    }
}
