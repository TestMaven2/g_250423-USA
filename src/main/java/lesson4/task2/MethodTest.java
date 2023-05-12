package lesson4.task2;

public class MethodTest {

    public static void main(String[] args) {

        System.out.println("Начало работы");

        System.out.println("Объявляем переменные");
        int a = 7;
        int b = 9;

        System.out.println("Вызываем метод");
        int c = add(a, b);

        System.out.println("Результат работы программы:");
        System.out.println(c);

        System.out.println("Конец работы");

        int nextResult = add(2, 3);
        System.out.println(nextResult);

        System.out.println(add(5, 3));

        int x = 10;
        int y = 5;
        int divResult = div(x, y);
        System.out.println("Результат деления:");
        System.out.println(divResult);

        System.out.println("Сумма длин двух слов:");
        System.out.println(getWordsLength("Java", "Hello"));
    }

    public static int add(int x, int y) {
        System.out.println("Метод начал работу");
        int result = x + y;
        System.out.println("Метод закончил работу");
        return result;
    }

    public static int div(int x, int y) {
        return x / y;
    }

    public static int getWordsLength(String word1, String word2) {
//        int length1 = word1.length();
//        int length2 = word2.length();
//        int result = length1 + length2;
//        return result;

        return word1.length() + word2.length();
    }
}
