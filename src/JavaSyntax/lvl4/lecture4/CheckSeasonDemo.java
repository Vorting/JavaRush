package JavaSyntax.lvl4.lecture4;

public class CheckSeasonDemo {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }


    public static void checkSeason(int checkSeason) {
        switch (checkSeason) {

            case 1:
                System.out.println("зима");
                break;
            case 2:
                System.out.println("зима");
                break;
            case 3:
                System.out.println("весна");
                break;
            case 4:
                System.out.println("весна");
                break;
            case 5:
                System.out.println("весна");
                break;
            case 6:
                System.out.println("лето");
                break;
            case 7:
                System.out.println("лето");
                break;
            case 8:
                System.out.println("лето");
                break;
            case 9:
                System.out.println("осень");
                break;
            case 10:
                System.out.println("осень");
                break;
            case 11:
                System.out.println("осень");
                break;
            case 12:
                System.out.println("зима");
                break;
        }
    }
}
