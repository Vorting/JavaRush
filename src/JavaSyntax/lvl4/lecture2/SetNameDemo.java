package JavaSyntax.lvl4.lecture2;

public class SetNameDemo {
    private String fullName;

    public static void main(String[] args) {
        SetNameDemo setNameDemo = new SetNameDemo();
        setNameDemo.setName("Petya", "Kotovich");
        System.out.println();

    }

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;
    }
}
