package JavaSyntax.lvl2.lecture2;


/*формула: ( °C × 9/5) + 32 =  °F
 */
public class DegreeConverterDemo {
    public static void main(String[] args) {

        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {

        double tf;
        tf = 9 / 5.0 * celsius + 32;

        return tf;
    }
}

