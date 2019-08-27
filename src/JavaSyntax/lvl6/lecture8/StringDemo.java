package JavaSyntax.lvl6.lecture8;

public class StringDemo {
    public static void main(String[] args) {

    }

    public static String multiply(String s) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < 5; i++) {
            result += s;
        }

        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //напишите тут ваш код
        while (count > 0) {
            result += s;
            count--;
        }
        return result;
    }

}
