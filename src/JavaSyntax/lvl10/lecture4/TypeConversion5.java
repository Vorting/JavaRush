package JavaSyntax.lvl10.lecture4;

public class TypeConversion5 {
    public static void main(String[] args) {
        int a = (byte) 44;
        int b = (short) 300;
        short c =(short) (b - a);
        System.out.println(c);
    }
}
