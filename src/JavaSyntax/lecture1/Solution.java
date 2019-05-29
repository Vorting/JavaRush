package JavaSyntax.lecture1;
// It`s a first exercises from JavaRush

public class Solution {
    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java opens many opportunities!");

    }


    public static void print(String s) {
        int count = 4;
        while (count != 0) {
            System.out.println(s);
            count--;
        }
    }
}