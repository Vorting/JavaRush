package JavaSyntax.lvl4.lecture7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumsDemo {


    public static void main(String[] args) throws IOException {

        int counter = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numbers = Integer.parseInt(reader.readLine());

        int tmp = numbers;
        while (tmp != 0) {
            counter++;
            tmp /= 10;
        }

        if (numbers > 0 && numbers < 1000) {
            if (counter == 1 && numbers % 2 == 0) {
                System.out.println("четное однозначное число");
            } else if (counter == 1 && numbers % 2 != 0){
                System.out.println("нечетное однозначное число");
            }
            else if (counter == 2 && numbers % 2 == 0) {
                System.out.println("четное двузначное число");
            } else if (counter == 2 && numbers % 2 != 0){
                System.out.println("нечетное двузначное число");
            }
            else if (counter == 3 && numbers % 2 == 0) {
                System.out.println("четное трехзначное число");
            } else if (counter == 3 && numbers % 2 != 0){
                System.out.println("нечетное трехзначное число");
            }
        } else {
            System.out.print("");
        }
    }
}
