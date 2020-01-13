package JavaSyntax.lvl10.lecture4;

public class TypeConversion4 {
    public static void main(String[] args) {
        int a = (byte) 44;
        int b = (short) 300;
        int c = (b - a);
        System.out.println(c);
    }
}
