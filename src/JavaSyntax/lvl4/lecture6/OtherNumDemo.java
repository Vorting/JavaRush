package JavaSyntax.lvl4.lecture6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OtherNumDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        int number1 = Integer.parseInt(n1);

        String n2 = reader.readLine();
        int number2 = Integer.parseInt(n2);

        String n3 = reader.readLine();
        int number3 = Integer.parseInt(n3);

        int[] arr = {number1, number2, number3};

        if ((arr[0] == arr[1]) && (arr[1] != arr[2])) {
            System.out.println(arr[2]);
        } else if ((arr[1] == arr[2]) && (arr[1] != arr[0])) {
            System.out.println(arr[0]);
        }  else {
            System.out.print("");
        }
    }
}
