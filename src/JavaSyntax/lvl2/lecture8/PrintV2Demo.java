package JavaSyntax.lvl2.lecture8;


public class PrintV2Demo {

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }


    public static void print3(String s) {
        int counter = 3;

        while (counter != 0) {
            System.out.print(s+" ");
            counter--;
        }
    }
}
