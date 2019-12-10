package JavaSyntax.lvl9.lecture11;

import java.util.ArrayList;
import java.util.List;

public class ScaryTale {

    public static LittleReaRidingHood hood = new LittleReaRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Patty patty = new Patty();
    public static Woodman woodman = new Woodman();
    public static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        patty.getClass();
        wolf.ate.add(grandmother);
        wolf.ate.add(hood);
        woodman.killed.add(wolf);
    }

    public static abstract class StoryItem {
        public List<StoryItem> killed = new ArrayList<>();
        public List<StoryItem> ate = new ArrayList<>();
    }

    public static class LittleReaRidingHood extends StoryItem {

    }

    public static class Grandmother extends StoryItem {
    }

    public static class Patty extends StoryItem {
    }

    public static class Woodman extends StoryItem {
    }

    public static class Wolf extends StoryItem {
    }

}
