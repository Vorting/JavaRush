package JavaSyntax.lvl9.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class VowelAndConsonant {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String typedText = reader.readLine();
            List<Character> vowels = new ArrayList<>();
            List<Character> consonants = new ArrayList<>();
            char[] charSymbols = typedText.toCharArray();

            for (int i = 0; i < charSymbols.length; i++) {
                char symbol = typedText.charAt(i);
                if (symbol == ' ') {
                    continue;
                }
                if (isVowel(symbol) == true) {
                    vowels.add(symbol);
                } else {
                    consonants.add(symbol);
                }
            }

            for (Character inChars : vowels) {
                System.out.print(inChars + " ");
            }
            System.out.println();
            for (Character inChars : consonants) {
                System.out.print(inChars + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        for (char d : vowels) {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
