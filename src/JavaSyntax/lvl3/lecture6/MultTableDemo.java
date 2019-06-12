package JavaSyntax.lvl3.lecture6;

public class MultTableDemo {
    public static void main(String[] args) {

        int pow = 1, res = 0, count = 0;
        int n = 10;

        while (n != 0) {
            res = pow * res + 1;
            n--;
            count++;
            System.out.println(count + "*"+pow + "=" + res);
        }
    }
}
