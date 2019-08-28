package JavaSyntax.lvl6.lecture11;

public class IdeaDemo {

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }

    public static void main(String[] args) {
        printIdea(new Idea());
    }

    private static class Idea {
        public String getDescription() {
            String text = "It`s a test message";
            return text;
        }
    }
}
