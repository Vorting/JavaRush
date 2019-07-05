package JavaSyntax.lvl4.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TrafficLightDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String hours = reader.readLine();
        double time = Double.parseDouble(hours);

        double number_after_comma = time % 5;

        if (number_after_comma >=0 && number_after_comma<3){
            System.out.println("зеленый");
        }else if (number_after_comma>=3 && number_after_comma<4){
            System.out.println("желтый");
        }else if (number_after_comma >=4 && number_after_comma<5){
            System.out.println("красный");
        }
    }

}
