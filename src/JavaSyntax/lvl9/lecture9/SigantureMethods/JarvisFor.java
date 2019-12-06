package JavaSyntax.lvl9.lecture9.SigantureMethods;

public class JarvisFor {
    public void sayHi(String... names) {
        for (String name : names) {
            System.out.println("Добрый вечер, " + name + ", как ваши дела?");
        }
    }

    public static void main(String[] args) {
        JarvisFor jarvis = new JarvisFor();
        jarvis.sayHi("Тони Старк", "Капитан Америка", "Черная Вдова", "Халк");
    }
}
