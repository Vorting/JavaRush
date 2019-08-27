package JavaSyntax.lvl6.lecture8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleReaderDemo {

    public static String readString() throws Exception {
        Scanner sc = new Scanner(System.in);
        String scanStr = sc.nextLine();
        return scanStr;
    }

    public static int readInt() throws Exception {
        Scanner sc = new Scanner(System.in);
        int scanInt = sc.nextInt();
        return scanInt;

    }

    public static double readDouble() throws Exception {
        Scanner sc = new Scanner(System.in);
        double scanDouble = sc.nextDouble();
        return scanDouble;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean scanBool = Boolean.parseBoolean(reader.readLine());
        return scanBool;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(readBoolean());

    }
}
