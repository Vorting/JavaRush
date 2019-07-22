package JavaSyntax.lvl4.lecture10;

public class While_S_Demo {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            i++;
            int t = 0;
            while (t < 10) {
                if (t == 10) {
                    break;
                }
                System.out.print("S");
                t++;
            }
            System.out.print("\n");
        }
    }
}
