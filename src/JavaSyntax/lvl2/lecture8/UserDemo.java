package JavaSyntax.lvl2.lecture8;

public class UserDemo {

    private String userName;
    private int userAge;
    private short userHeight;


    public UserDemo() {
        System.out.println("Create an user...");
    }

    public UserDemo(String userName) {
        this.userName = userName;
    }

    public UserDemo(String userName, short userHeight) {
        this.userName = userName;
        this.userHeight = userHeight;
    }


    public UserDemo(String userName, short userHeight, int userAge) {
        this.userName = userName;
        this.userHeight = userHeight;
        this.userAge = userAge;
    }

    public static void main(String[] args) {
        UserDemo userDemo1 = new UserDemo();
        UserDemo userDemo2 = new UserDemo("Vasya");
        UserDemo userDemo3 = new UserDemo("Kolya", (short) 2);
        UserDemo userDemo4 = new UserDemo("Kolya", (short) 3, 26);


        System.out.println("№1: "+userDemo1);
        System.out.println("№2: "+userDemo2.userName);
        System.out.println("№3: "+userDemo3.userName + ", user height is " + userDemo2.userHeight);
        System.out.println("№4: "+userDemo4.userName + ", user height is " + userDemo4.userHeight + ", user age is " + userDemo4.userAge);
    }
}
