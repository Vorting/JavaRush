package JavaSyntax.lvl8.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeToUpperCase {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String changeToUpperCase = reader.readLine();

        char[] changeToCharArray = changeToUpperCase.toCharArray();
        changeToCharArray[0] = Character.toUpperCase(changeToCharArray[0]);

        for (int i = 0; i < changeToCharArray.length - 1; i++) {
            if (changeToCharArray[i] == ' ')
                changeToCharArray[i + 1] = Character.toUpperCase(changeToCharArray[i + 1]);
        }
        System.out.println(changeToCharArray);
    }
}

