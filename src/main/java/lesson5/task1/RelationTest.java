package lesson5.task1;

public class RelationTest {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 5;

        System.out.println("Сравниваем a и b: " + (a == b));
        System.out.println("Сравниваем а и с: " + (a == c));

        boolean result = a == b;

        System.out.println("Значение переменной result: " + result);
    }
}
