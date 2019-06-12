package JavaSyntax.lvl3.lecture6;

public class MamaRamaDemo {
    public static void main(String[] args) {
        String mama = "Мама";
        String mila = "Мыла";
        String ramu = "Раму";
        String text = "МамаРамуМыла";

        System.out.println(mama + mila + ramu);
        System.out.println(mila + ramu + mama);
        System.out.println("Мыла" + "Мама" + "Раму");
        System.out.println("Раму" + "Мыла" + "Мама");
        System.out.println("Раму" + "Мама" + "Мыла");
        System.out.println(text);
    }
}
