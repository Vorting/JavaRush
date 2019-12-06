package JavaSyntax.lvl9.lecture9.SigantureMethods;

public class Jarvis {

    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();
        jarvis.printInfoFromDatabase("Лора Палмер. Дата рождения - 22 июля 1972, город Твин Пикс, штат Вашингтон");
        System.out.println();
        jarvis.printInfoFromDatabase("Макс Эйзенхарт. Рост 188см, вес 86 кг. ", true, "Магнетто");

    }

    public void printInfoFromDatabase(String bio) {
        System.out.println(bio);
    }

    public void printInfoFromDatabase(String bio, boolean isEvil, String nickname) {

        System.out.println(bio);

        if (!isEvil) {
            System.out.println("Также известен как супергерой " + nickname);
        } else {
            System.out.println("Также известен как суперзлодей " + nickname);
        }
    }
}
