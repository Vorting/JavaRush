package JavaSyntax.lvl6.lecture8;

public class StringDemo {
    public static void main(String[] args) {
        StringHelper test = new StringHelper();
        test.multiply("Амиго 1", 5);
        test.multiply("Амиго 2");
    }


    public static class StringHelper {
        private static String string;
        private static int count = 0;

        public static String multiply(String s, int count) {
            while (count > 0) {
                System.out.println(s);
                count--;
            }
            return s;
        }

        public static String multiply(String s) {
            for (int i = 0; i < 5; i++) {
                System.out.println(s);
            }
            return s;
        }
    }
}
