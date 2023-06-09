package lesson12.task1;

import lesson8.task2.Cat;

public class StringTest {

    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        // Сравнение примитивных переменных по значению
        System.out.println("Сравнение примитивных переменных по значению");
        System.out.println(a == b);

        Cat cat1 = new Cat(3, "Black");
        Cat cat2 = new Cat(3, "Black");
        Cat cat3 = cat1;

        // cat1 и cat2 - это одинаковые коты, но это два кота
        // cat1 и cat3 - это один и тот же кот

        // Сравнение объектов по ссылкам
        System.out.println("Сравнение объектов котов по ссылкам");
        System.out.println(cat1 == cat2);
        System.out.println(cat1 == cat3);

        // Сравнение объектов по их значениям
        System.out.println("Сравнение объектов котов по их значениям");
        System.out.println(cat1.equals(cat2));

        String word1 = "Hello";
        String word2 = "Hello";

        System.out.println("Сравнение объектов строк по их значениям");
        System.out.println(word1.equals(word2));

        System.out.println("Сравнение объектов строк по ссылкам");
        System.out.println(word1 == word2);

        cat3.setAge(7);
        System.out.println(cat1.getAge());
        System.out.println(cat2.getAge());

        word2 = "Java";

        System.out.println(word2);
        System.out.println(word1);
    }
}
