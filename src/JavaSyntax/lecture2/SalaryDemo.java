package JavaSyntax.lecture2;

public class SalaryDemo {


    public static void main(String[] args) {
        hackSalary(700);
    }

    public static void hackSalary(int a) {

        int b = 100, result;
        result = a + b;

        System.out.println("Твоя зарплата составляет: " + result+" долларов в месяц.");
    }
}


