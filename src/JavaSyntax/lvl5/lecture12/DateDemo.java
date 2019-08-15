package JavaSyntax.lvl5.lecture12;

public class DateDemo {
    private int day;
    private int month;
    private int year;

    public static void main(String[] args) {
        DateDemo date = new DateDemo();
        date.setDay(15);
        date.setMonth(8);
        date.setYear(2019);
        System.out.println(date.day + " " + date.month + " " + date.year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
