package JavaSyntax.lvl10.lecture11;

public class BigSalaryString {
    public static void main(String[] args) {
        String salary = "Я не хочу изучать Java, я хочу большую зарплату";
      for (int i=0; i<=40 ; i++){
          System.out.println(salary.substring(i));
      }
    }
}
