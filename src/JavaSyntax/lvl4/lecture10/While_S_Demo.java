package JavaSyntax.lvl4.lecture10;

public class While_S_Demo {
    public static void main(String[] args) {
        String l = "S";
        int start = 0;
        while (start != 10) {
            start++;
            int finish = start;
            while (finish == start) {
                System.out.print("S");
                finish--;

            }
        }
    }
}
