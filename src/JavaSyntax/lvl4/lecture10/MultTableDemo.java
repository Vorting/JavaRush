package JavaSyntax.lvl4.lecture10;

public class MultTableDemo {
    public static void main(String[] args) {

        int i = 0;
        int power = 1;
        while (i < 10) { // перебираем строки
            i++;
            int t = 1;
            while (t <= 11) { // перебираем столбцы
                if (t == 11) { // когда последний элемент в столбце равен 11, переходим на новую строку
                    break;
                }
                power = i * t; // перемножаем элементы в строке, на каждый след. элемент в стоблце
                System.out.printf("%5d",power );
                t++;
            }
            System.out.println();
        }
    }
}
